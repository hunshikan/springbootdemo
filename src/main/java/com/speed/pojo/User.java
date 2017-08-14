package com.speed.pojo;

import java.io.Serializable;

/**
 * Created by liupengtao on 2017/8/13.
 */
public class User implements Serializable{
    private  Integer age;
    private  String username;
    private  String password;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
