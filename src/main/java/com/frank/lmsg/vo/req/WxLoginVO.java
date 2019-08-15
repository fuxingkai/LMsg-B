package com.frank.lmsg.vo.req;

import java.io.Serializable;

/**
 *
 * Description: 用户信息 微信登录验证VO
 * Auth: Frank
 * Date: 2019-08-09
 * Time: 下午 2:22
 */
public class WxLoginVO implements Serializable {
    private String encryptedData;
    private String iv;
    private String rawData;
    private String signature;
    private String code;

    public String getEncryptedData() {
        return encryptedData;
    }

    public void setEncryptedData(String encryptedData) {
        this.encryptedData = encryptedData;
    }

    public String getIv() {
        return iv;
    }

    public void setIv(String iv) {
        this.iv = iv;
    }

    public String getRawData() {
        return rawData;
    }

    public void setRawData(String rawData) {
        this.rawData = rawData;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "WxLoginVO{" +
                "encryptedData='" + encryptedData + '\'' +
                ", iv='" + iv + '\'' +
                ", rawData='" + rawData + '\'' +
                ", signature='" + signature + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
