package com.frank.lmsg.service;

import com.frank.lmsg.base.vo.ResponseVO;
import com.frank.lmsg.vo.req.WxLoginVO;
import com.frank.lmsg.vo.resp.UserInfoVo;
import com.frank.lmsg.vo.resp.WxUserInfoVO;

/**
 *
 * Description: 用户信息业务处理接口类
 * Auth: Frank
 * Date: 2019-08-09
 * Time: 下午 1:58
 */
public interface IUserService {

    /**
     * 用户登录注册
     * @param loginVO 用户登录验证信息
     * @return 用户信息
     */
    ResponseVO<UserInfoVo> login(WxLoginVO loginVO) throws Exception;

}
