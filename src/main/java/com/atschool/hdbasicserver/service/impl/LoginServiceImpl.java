package com.atschool.hdbasicserver.service.impl;

import com.atschool.hdbasicserver.bean.User;
import com.atschool.hdbasicserver.mapper.LoginMapper;
import com.atschool.hdbasicserver.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    LoginMapper loginMapper;

    public boolean ifExist(String username){
        User userByName = loginMapper.findUserByName(username);
        if (userByName==null){
            return false;
        }
        return true;
    }

    public boolean login(User user){
        String username=user.getUsername();
        User userByName = loginMapper.findUserByName(username);
        if (userByName.getPassword().equals(user.getPassword())){
            return true;
        }
        return false;
    }


}
