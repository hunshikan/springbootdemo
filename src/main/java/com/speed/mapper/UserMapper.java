package com.speed.mapper;

import com.speed.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * Created by liupengtao on 2017/8/13.
 */
@Mapper
public interface UserMapper {

  public List<User> findALL();

}
