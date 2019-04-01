package com.ipenta.mapper;

import com.ipenta.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper  {
    /**
     * 通过名字查询用户信息
     */
    User findUserByName(String name);

}