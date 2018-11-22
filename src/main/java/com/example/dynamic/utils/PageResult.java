package com.example.dynamic.utils;

import lombok.Data;

import java.util.List;

/**
 * @author: yuxin
 * @date: 2018/11/23 12:24 AM
 * @description:
 */
@Data
public class PageResult<T> extends BaseResult{

    private Integer pageSize;
    private Integer pageNo;
    private List<T> data;

    public PageResult<T> success(Integer pageNo, Integer pageSize, List<T> data) {
        this.setPageNo(pageNo);
        this.setPageSize(pageSize);
        this.setData(data);
        return this;
    }
}
