package com.ipenta.controller;

import com.ipenta.entity.User;
import com.ipenta.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    private final UserMapper userMapper;

    public MainController(final UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @RequestMapping("/")
    public String hello() {
        User user = userMapper.findUserByName("yiyern");
        if (null == user) {
            return "hell: 404";
        }

        return "hello：" + user.getName() + "，你有: " + user.getMoney() + " 爱看d： " + said();
    }

    public String said() {
        return "归属,突";
    }
}
