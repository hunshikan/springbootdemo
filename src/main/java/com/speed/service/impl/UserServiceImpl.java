package com.speed.service.impl;

import com.speed.mapper.UserMapper;
import com.speed.pojo.User;
import com.speed.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import redis.clients.jedis.JedisCluster;

import java.util.List;

/**
 * Created by liupengtao on 2017/8/13.
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private  UserMapper usermapper;

    @Autowired
    private JedisCluster jedisCluster;

    //@Cacheable(value = "findALL")  //redis缓存
    public List<User> findALL(){
        List<User> listuser=usermapper.findALL();
        return  listuser;
    }

    public String findredis(){
        jedisCluster.set("username","admin");
        String value=jedisCluster.get("username");
        return value;
    }
}
