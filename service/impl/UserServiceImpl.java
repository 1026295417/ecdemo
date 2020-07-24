package com.ecdata.demo.service.impl;

import com.ecdata.demo.dao.UserMapper;
import com.ecdata.demo.pojo.User;
import com.ecdata.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public int add(User user) {
        return userMapper.insert(user);
    }
}

