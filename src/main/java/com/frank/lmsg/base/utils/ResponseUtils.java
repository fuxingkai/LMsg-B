package com.frank.lmsg.base.utils;

import com.frank.lmsg.base.vo.ResponseVO;
import org.springframework.http.HttpStatus;

/**
 * 接口应答格式工具类
 *
 * @author Giam
 * @date 2019/1/12
 */
public enum ResponseUtils {
    /**
     * 单例
     */
    INSTANCE;

    /**
     * 成功返回
     *
     * @param <T>
     * @return
     */
    public <T> ResponseVO<T> success() {
        return success(null);
    }

    public <T> ResponseVO<T> success(T data) {
        int code = HttpStatus.OK.value();
        String desc = HttpStatus.OK.getReasonPhrase();
        return new ResponseVO<>(code, data, desc);
    }

    /**
     * 失败返回
     *
     * @param <T>
     * @return
     */
    public <T> ResponseVO<T> fail() {
        return fail(null);
    }

    public <T> ResponseVO<T> fail(T data) {
        int code = HttpStatus.BAD_REQUEST.value();
        String desc = HttpStatus.BAD_REQUEST.getReasonPhrase();
        return new ResponseVO<>(code, data, desc);
    }

    /**
     * 系统错误
     *
     * @param <T>
     * @return
     */
    public <T> ResponseVO<T> error(HttpStatus status, String desc) {
        ResponseVO<T> responseVO = new ResponseVO<>(status.value(), desc);
        return responseVO;
    }
}
