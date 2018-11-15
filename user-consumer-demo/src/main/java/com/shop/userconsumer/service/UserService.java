package com.shop.userconsumer.service;

import com.shop.userconsumer.dao.UserDao;
import com.shop.userconsumer.dao.UserFeignClient;
import com.shop.userconsumer.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

   /* @Autowired
    private RestTemplate restTemplate;*/

    @Autowired
    private DiscoveryClient discoveryClient; // Eureka客户端，可以获取到服务实例信息

    @Autowired
    private UserFeignClient userFeignClient;

    public List<User> queryUserByIds(List<Long> ids) {
        List<User> users = new ArrayList<>();
        ids.forEach(id ->{
            //users.add(userDao.queryUserByid(id));
            users.add(userFeignClient.queryUserByid(id));
        });
        return users;
    }

/*    public List<User> queryUserByIds(List<Long> ids) {
        List<User> users = new ArrayList<>();
      *//*  //获取服务实例
        List<ServiceInstance> instances = discoveryClient.getInstances("user-service");
        ServiceInstance instance = instances.get(0);
        //获取url地址
        String baseurl = "http://" + instance.getHost() + ":" + instance.getPort() + "/user/";*//*
        String baseurl = "http://user-service/user/";
        //调用服务
        ids.forEach(id -> {
            users.add(restTemplate.getForObject(baseurl + id, User.class));
            //每次间隔500毫秒
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        return users;
    }*/

   /* public List<User> queryByIds(List<Long> ids) {
        ArrayList<User> users = new ArrayList<>();
        for (long id : ids) {
            User user = userDao.queryById(id);
            users.add(user);
        }
        return users;
    }*/
}
