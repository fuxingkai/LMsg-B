package com.frank.lmsg.base.vo;

import org.springframework.util.StringUtils;

import java.io.Serializable;


/**
 * Description: 请求响应实体类
 * Auth: Frank
 * Date: 2019-08-09
 * Time: 下午 1:58
 */
public class ResponseVO<T> implements Serializable {
    private Integer code;
    private String desc;
    private T data;

    /**
     * @param code
     * @param desc
     */
    public ResponseVO(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     *
     * @param code
     * @param desc
     * @param data
     */
    public ResponseVO(int code, String desc,T data) {
        this.code = code;
        this.desc = StringUtils.isEmpty(desc) ? desc : "";
        this.data = data;
    }


    /**
     * @param data 返回数据
     * @param desc 应答说明
     */
    public ResponseVO(int code, T data, String desc) {
        this.code = code;
        this.desc = StringUtils.isEmpty(desc) ? desc : "";
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseVO{" +
            "code=" + code +
            ", desc='" + desc + '\'' +
            ", data=" + data +
            '}';
    }
}
