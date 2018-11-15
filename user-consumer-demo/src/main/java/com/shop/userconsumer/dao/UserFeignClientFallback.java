package com.shop.userconsumer.dao;

import com.shop.userconsumer.pojo.User;
import org.springframework.stereotype.Component;

@Component
public class UserFeignClientFallback implements UserFeignClient {
    @Override
    public User queryUserByid(Long id) {
        User u = new User();
        u.setId(id);
        u.setName("服务器繁忙，请稍后再试");
        return u;
    }
}
