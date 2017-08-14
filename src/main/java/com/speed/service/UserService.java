package com.speed.service;

import com.speed.pojo.User;

import java.util.List;

/**
 * Created by liupengtao on 2017/8/13.
 */
public interface UserService {
    public List<User> findALL();

    public String findredis();//查询redis集群
}
