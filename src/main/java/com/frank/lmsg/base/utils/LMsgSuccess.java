package com.frank.lmsg.base.utils;

import org.springframework.lang.Nullable;

/**
 * Description: 成功码
 * Auth: Frank
 * Date: 2019-08-13
 * Time: 上午 11:47
 */
public enum LMsgSuccess {


    /**
     *返回数据成功
     */
    OK(200, "返回数据成功");

    private final int code;

    private final String succesMsg;


    LMsgSuccess(int code, String succesMsg) {
        this.code = code;
        this.succesMsg = succesMsg;
    }


    /**
     * 成功码
     * @return
     */
    public int code() {
        return this.code;
    }

    /**
     * 获得成功码的描述
     * @return
     */
    public String getSuccesMsg() {
        return this.succesMsg;
    }


    /**
     *
     * @param statusCode
     * @return
     */
    public static LMsgSuccess valueOf(int statusCode) {
        LMsgSuccess error = resolve(statusCode);
        if (error == null) {
            throw new IllegalArgumentException("No matching constant for [" + statusCode + "]");
        }
        return error;
    }

    /**
     * 成功码
     * @param statusCode
     * @return
     */
    @Nullable
    public static LMsgSuccess resolve(int statusCode) {
        for (LMsgSuccess error : values()) {
            if (error.code == statusCode) {
                return error;
            }
        }
        return null;
    }



}
