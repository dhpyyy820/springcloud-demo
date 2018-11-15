package com.shop.userservice.service;

import com.shop.userservice.mapper.UserMapper;
import com.shop.userservice.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryById(Long id) throws InterruptedException {
        //为演示服务熔断，线程随机休眠1~2000ms
        Thread.sleep(new Random().nextInt(2000));
        return userMapper.selectByPrimaryKey(id);
    }
}
