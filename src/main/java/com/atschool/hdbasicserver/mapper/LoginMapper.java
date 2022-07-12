package com.atschool.hdbasicserver.mapper;

import com.atschool.hdbasicserver.bean.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {


    public User findUserByName(String name);

    public void registerUser(String username,String password);
}
