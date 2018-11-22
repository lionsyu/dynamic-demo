package com.example.dynamic.controller;

import com.example.dynamic.domain.Shop;
import com.example.dynamic.domain.User;
import com.example.dynamic.service.DemoService;
import com.example.dynamic.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: yuxin
 * @date: 2018/11/23 12:20 AM
 * @description:
 */
@RestController
@RequestMapping("demo")
public class DemoController {

    @Autowired
    DemoService demoService;

    @GetMapping("user")
    public ResponseResult<User> getUser() {
        return new ResponseResult<User>().success(demoService.getUser());
    }

    @GetMapping("shop")
    public ResponseResult<Shop> getShop(){
        return new ResponseResult<Shop>().success(demoService.getShop());
    }

    @GetMapping("dynamic")
    public ResponseResult<List<String>> getDemo(){
        return new ResponseResult<List<String>>().success(demoService.getDemo());
    }
}
