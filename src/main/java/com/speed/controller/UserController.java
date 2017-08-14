package com.speed.controller;

import  com.speed.pojo.User;
import com.speed.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by liupengtao on 2017/8/13.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("indexs")
    public String indexs() {

    return "你好吗 spring boot";
    }

    @RequestMapping("showuser")
    public User showUser(){
        User user=new User();
        user.setAge(25);
        user.setPassword("admin");
        user.setUsername("admin");
        return  user;
    }

    @RequestMapping("mapsuser")
    public Map<String,Object> showmap(){
        Map<String,Object> maps=new HashMap<>();
        maps.put("username","张无忌");
        maps.put("password","123");
        return  maps;
    }

    @RequestMapping("listuser")
    public List<User> showlist(){
        List<User> listuser=new ArrayList<>();
        User user1=new User();
        User user2=new User();
        user1.setAge(25);
        user1.setPassword("admin1");
        user1.setUsername("admin1");
        user2.setAge(99);
        user2.setPassword("admin2");
        user2.setUsername("admin2");
        listuser.add(user1);
        listuser.add(user2);
        return listuser;
    }

    @RequestMapping("ssm")
    public List<User> findAll(){
        List<User> listuser=userService.findALL();
        return  listuser;
    }

    @RequestMapping("redis")
    public String findredis(){
       String findredis=userService.findredis();
        return  findredis;
    }
}
