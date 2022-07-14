package com.atschool.hdbasicserver.service;

import com.atschool.hdbasicserver.bean.User;

public interface LoginService {
    public boolean ifExist(String username);
    public boolean login(User user);
}
