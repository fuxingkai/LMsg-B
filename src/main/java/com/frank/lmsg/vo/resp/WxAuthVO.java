package com.frank.lmsg.vo.resp;

public class WxAuthVO {
    private String openId;
    private String sessionKey;

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    @Override
    public String toString() {
        return "WxAuthVO{" +
                "openId='" + openId + '\'' +
                ", sessionKey='" + sessionKey + '\'' +
                '}';
    }
}
