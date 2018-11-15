package com.shop.userservice.mapper;

import com.shop.userservice.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper  extends tk.mybatis.mapper.common.Mapper<User> {
}
