package com.frank.lmsg.vo.resp;

/**
 * Description: 用户信息 响应实体类
 * Auth: Frank
 * Date: 2019-08-09
 * Time: 下午 1:58
 */
public class UserInfoVo {
    /**
     * 用户id
     */
    private Integer id;

    /**
     * 用户openid
     */
    private String openId;

    /**
     * 用户unionId
     */
    private String unionId;

    /**
     * 用户类型
     */
    private String userType;

    /**
     * 用户头像
     */
    private String avatarUrl;

    /**
     * 城市
     */
    private String city;

    /**
     * 国家
     */
    private String country;

    /**
     * 语言
     */
    private String language;

    /**
     * 昵称
     */

    private String nickName;

    /**
     * 省份
     */
    private String province;

    /**
     * token
     */
    private String token;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "UserInfoVo{" +
                "id=" + id +
                ", openId='" + openId + '\'' +
                ", unionId='" + unionId + '\'' +
                ", userType='" + userType + '\'' +
                ", avatarUrl='" + avatarUrl + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", language='" + language + '\'' +
                ", nickName='" + nickName + '\'' +
                ", province='" + province + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
