package com.linphilip.springbootmall.service.impl;

import com.linphilip.springbootmall.dao.UserDao;
import com.linphilip.springbootmall.dto.UserRegisterRequest;
import com.linphilip.springbootmall.model.User;
import com.linphilip.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
