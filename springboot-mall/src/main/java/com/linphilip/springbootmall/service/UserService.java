package com.linphilip.springbootmall.service;

import com.linphilip.springbootmall.dto.UserRegisterRequest;
import com.linphilip.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);
}
