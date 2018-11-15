package com.shop.userconsumer.dao;

import org.springframework.stereotype.Component;

@Component
public class UserDao {
/*
    private static final Logger logger = LoggerFactory.getLogger(UserDao.class);

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "queryUserByidFallback")
    public User queryUserByid(Long id) {
        long begin = System.currentTimeMillis();
        String url = "http://user-service/user/" + id;
        User user = restTemplate.getForObject(url, User.class);
        long end = System.currentTimeMillis();
        logger.info(id + "调用用时：{}", end-begin);
        return user;
    }

    public User queryUserByidFallback(Long id) {
        User u  = new User();
        u.setId(id);
        u.setName("服务器繁忙，请稍后再试");
        return u;
    }

    public User queryById(Long id) {
        String url = "http://localhost:8081/user/" + id;
        return restTemplate.getForObject(url, User.class);
    }*/
}
