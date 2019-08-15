package com.frank.lmsg.base.vo;

/**
 * Description: 请求公共实体类
 * Auth: Frank
 * Date: 2019-08-09
 * Time: 下午 1:58
 */
public class RequestVO {
    private String token;
    private Long sceneryId;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Long getSceneryId() {
        return sceneryId;
    }

    public void setSceneryId(Long sceneryId) {
        this.sceneryId = sceneryId;
    }

    @Override
    public String toString() {
        return "RequestParamVO{" +
                "token='" + token + '\'' +
                ", sceneryId=" + sceneryId +
                '}';
    }
}
