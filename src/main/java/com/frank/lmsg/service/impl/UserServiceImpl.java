package com.frank.lmsg.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.frank.lmsg.base.utils.*;
import com.frank.lmsg.base.vo.ResponseVO;
import com.frank.lmsg.constant.WxConsts;
import com.frank.lmsg.mybatis.domain.UserInfo;
import com.frank.lmsg.mybatis.mapper.UserInfoDao;
import com.frank.lmsg.service.IUserService;
import com.frank.lmsg.vo.req.WxLoginVO;
import com.frank.lmsg.vo.resp.UserInfoVo;
import com.frank.lmsg.vo.resp.WxAuthVO;
import com.frank.lmsg.vo.resp.WxUserInfoVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Description: 用户信息业务处理实现类
 * Auth: Frank
 * Date: 2019-08-09
 * Time: 下午 2:29
 */
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UserInfoDao userInfoDao;

    @Override
    public ResponseVO<UserInfoVo> login(WxLoginVO loginVO) throws Exception {
        String code2SessionUrl = WxUtils.getApi(WxConsts.API_SESSION_KEY, loginVO.getCode());
        String result = HttpUtils.doGet(code2SessionUrl);
        WxAuthVO wxAuthVO = JSONObject.parseObject(result, WxAuthVO.class);

        if(!loginVO.getSignature().equals(WxUtils.getSignature(loginVO.getRawData(),wxAuthVO.getSessionKey()))){
            return new ResponseVO<UserInfoVo>(LMsgError.WX_SIGNATURE.code(), LMsgError.WX_SIGNATURE.getErrorMsg(),null);
        }

        if (null != wxAuthVO.getOpenId()) {
            UserInfo userinfo = null;
            UserInfoVo respUserInfo = null;
            userinfo = userInfoDao.selectByOpenId(wxAuthVO.getOpenId());
            if(null == userinfo){
                WxUserInfoVO wxUserInfo = WxUtils.encryptedDataUserInfo(loginVO.getEncryptedData(), wxAuthVO.getSessionKey(), loginVO.getIv());
                userinfo = JSON.parseObject(JSON.toJSONString(wxUserInfo),UserInfo.class);
                userinfo.setUsertype("1");
                userInfoDao.insert(userinfo);
            }
            respUserInfo = JSON.parseObject(JSON.toJSONString(userinfo),UserInfoVo.class);
            respUserInfo.setToken(TokenUtil.getToken(userinfo));

            return new ResponseVO<UserInfoVo>(LMsgSuccess.OK.code(), LMsgSuccess.OK.getSuccesMsg(),respUserInfo);
        }

        return new ResponseVO<UserInfoVo>(LMsgError.COMMON_EMPTY.code(), LMsgError.COMMON_EMPTY.getErrorMsg(),null);
    }
}
