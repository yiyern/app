package com.ipenta.controller;

import com.ipenta.entity.UserInfo;
import com.ipenta.mapper.UserInfoMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @RequestMapping("/")
    public String hello() {

        UserInfo entity = new UserInfo();
        entity.setAge(11);
        entity.setName("oooooo");
        entity.setMoney(Double.parseDouble("1111.11"));

        userInfoMapper.insert(entity);

        // List<UserInfo> userInfos =
        // userInfoMapper.selectByExample(Example.builder(example));
        // if (null == userInfos) {
        // return "hell: 404";
        // }
        return "hello：" + entity;
    }
}
