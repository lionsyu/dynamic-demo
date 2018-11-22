package com.example.dynamic.utils;

/**
 * @author: yuxin
 * @date: 2018/11/23 12:23 AM
 * @description:
 */
public enum CodeEnum {

    OK(10000, "SUCCESS");

    private int code;
    private String msg;

    CodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
