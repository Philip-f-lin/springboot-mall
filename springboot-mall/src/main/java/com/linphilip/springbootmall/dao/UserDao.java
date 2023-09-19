package com.linphilip.springbootmall.dao;

import com.linphilip.springbootmall.dto.UserRegisterRequest;
import com.linphilip.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    Integer createUser(UserRegisterRequest userRegisterRequest);

    User getUserByEmail(String email);

}
