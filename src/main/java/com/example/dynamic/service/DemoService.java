package com.example.dynamic.service;

import com.example.dynamic.domain.Shop;
import com.example.dynamic.domain.User;
import com.example.dynamic.mapper.ShopMapper;
import com.example.dynamic.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: yuxin
 * @date: 2018/11/23 12:25 AM
 * @description:
 */
@Service
public class DemoService {


    @Autowired
    UserMapper userMapper;
    @Autowired
    ShopMapper shopMapper;

    public User getUser() {
        return userMapper.selectById(1L);
    }

    public Shop getShop() {
        return shopMapper.selectById(1L);
    }

    public List<String> getDemo() {
        User user = userMapper.selectById(1L);
        Shop shop = shopMapper.selectById(1L);
        List<String> list = new ArrayList<>();
        list.add(user.getUsername());
        list.add(shop.getName());
        return list;
    }
}
