package com.frank.lmsg.constant;


/**
 *
 * Description: 微信信息相关常量
 * Auth: Frank
 * Date: 2019-08-09
 * Time: 下午 1:58
 */
public class WxConsts {
    public static String APP_ID = "wxc8428c65224939d1";
    public static String APP_SECRET = "6e3a148e259d3718021dbe773c2d5458";
    public static String BASE_URL = "https://api.weixin.qq.com";

    public static String API_SESSION_KEY = BASE_URL + "/sns/jscode2session?appid=%s&secret=%s&js_code={0}&grant_type=authorization_code";
}