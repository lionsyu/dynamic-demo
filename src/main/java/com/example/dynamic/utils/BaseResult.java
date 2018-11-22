package com.example.dynamic.utils;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: yuxin
 * @date: 2018/11/23 12:23 AM
 * @description:
 */
@Data
public class BaseResult implements Serializable {
    private static final long serialVersionUID = -2087812355229005895L;

    private Integer code = CodeEnum.OK.getCode();
    private String msg = CodeEnum.OK.getMsg();
    private Boolean success = true;

    public <T> T error(CodeEnum errorEnum) {
        this.setCode(errorEnum.getCode());
        this.setMsg(errorEnum.getMsg());
        this.setSuccess(false);
        return (T)this;
    }
}
