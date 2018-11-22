package com.example.dynamic.domain;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author: yuxin
 * @date: 2018/11/23 12:26 AM
 * @description:
 */
@TableName("shop")
@Data
public class Shop implements Serializable{

    private static final long serialVersionUID = 4337559692790773948L;
    private Long id;
    private String name;
    private Integer level;
    private Integer isDeleted;
    private LocalDateTime gmtCreated;
    private LocalDateTime gmtModified;
}
