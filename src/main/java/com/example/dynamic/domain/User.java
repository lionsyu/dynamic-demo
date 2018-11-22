package com.example.dynamic.domain;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author: yuxin
 * @date: 2018/11/23 12:27 AM
 * @description:
 */
@TableName("user")
@Data
public class User implements Serializable{

    private static final long serialVersionUID = 6346912252191170632L;
    private Long id;
    private String username;
    private Integer age;
    private Integer sex;
    private Integer isDeleted;
    private LocalDateTime gmtCreated;
    private LocalDateTime gmtModified;
}
