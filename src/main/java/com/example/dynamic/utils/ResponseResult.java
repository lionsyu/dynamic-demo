package com.example.dynamic.utils;

import lombok.Data;

/**
 * @author: yuxin
 * @date: 2018/11/23 12:24 AM
 * @description:
 */
@Data
public class ResponseResult<T> extends BaseResult {

    private T data;

    public ResponseResult<T> success(T data) {
        this.setData(data);
        return this;
    }

    public ResponseResult<T> result(Integer code, String msg) {
        return result(code, msg,null);
    }

    public ResponseResult<T> result(Integer code, String msg, T data) {
        this.setCode(code);
        this.setMsg(msg);
        this.setData(data);
        return this;
    }
}
