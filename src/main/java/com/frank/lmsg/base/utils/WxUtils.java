package com.frank.lmsg.base.utils;

import com.alibaba.fastjson.JSONObject;
import com.frank.lmsg.constant.WxConsts;
import com.frank.lmsg.vo.resp.UserInfoVo;
import com.frank.lmsg.vo.resp.WxUserInfoVO;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.logging.log4j.LogManager;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.AlgorithmParameters;
import java.security.Security;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Base64;

/**
 * 微信用户信息解密工具
 *
 * @author Giam
 * @version 1.0
 * @date 2019/6/19
 */
public class WxUtils {
    /**
     * 微信获取用户信息 encryptedData解密
     * <p>
     *     解密算法如下：
     *     1.对称解密使用的算法为 AES-128-CBC，数据采用PKCS#7填充。
     *     2. 对称解密的目标密文为 Base64_Decode(encryptedData)。
     *     3. 对称解密秘钥 aeskey = Base64_Decode(session_key), aeskey 是16字节。
     *     4. 对称解密算法初始向量 为Base64_Decode(iv)，其中iv由数据接口返回。
     * </p>
     *
     * @param encryptedData 加密的数据
     * @param sessionKey sessionKey
     * @param iv iv
     * @return
     */
    public static WxUserInfoVO encryptedDataUserInfo(String encryptedData, String sessionKey, String iv){
        // 被加密的数据
        Base64.Decoder decoder = Base64.getDecoder();

        byte[] dataByte = decoder.decode(encryptedData);
        // 加密秘钥
        byte[] keyByte = decoder.decode(sessionKey);
        // 偏移量
        byte[] ivByte = decoder.decode(iv);

        try {
            // 如果密钥不足16位，那么就补足.  这个if 中的内容很重要
            int base = 16;
            if (keyByte.length % base != 0) {
                int groups = keyByte.length / base + (keyByte.length % base != 0 ? 1 : 0);
                byte[] temp = new byte[groups * base];
                Arrays.fill(temp, (byte) 0);
                System.arraycopy(keyByte, 0, temp, 0, keyByte.length);
                keyByte = temp;
            }
            // 初始化
            Security.addProvider(new BouncyCastleProvider());
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding","BC");
            SecretKeySpec spec = new SecretKeySpec(keyByte, "AES");
            AlgorithmParameters parameters = AlgorithmParameters.getInstance("AES");
            parameters.init(new IvParameterSpec(ivByte));
            cipher.init(Cipher.DECRYPT_MODE, spec, parameters);
            byte[] resultByte = cipher.doFinal(dataByte);
            if (null != resultByte && resultByte.length > 0) {
                String result = new String(resultByte, StandardCharsets.UTF_8);
                return JSONObject.parseObject(result, WxUserInfoVO.class);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     *  获得微信signature
     *  signature = sha1( rawData + session_key )
     * @param rawData rawData
     * @param sessionKey sessionKey
     * @return
     */
    public static String getSignature(String rawData, String sessionKey) {
        StringBuffer signatureStr = new StringBuffer();
        signatureStr.append(rawData);
        signatureStr.append(sessionKey);
        return DigestUtils.sha1Hex(signatureStr.toString().getBytes());
    }

    /**
     * 获取登录信息URL并拼接相关参数
     * @param api
     * @param arg
     * @return
     */
    public static String getApi(String api, Object... arg) {
        String url = String.format(api, WxConsts.APP_ID, WxConsts.APP_SECRET);
        url = MessageFormat.format(url, arg);
        return url;
    }


}
