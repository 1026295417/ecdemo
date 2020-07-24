package com.example.demo.controller;

import com.example.demo.pojo.User;
import com.example.demo.pojo.UserExample;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public int add(User user) {
        return userService.add(user);
    }

    @GetMapping("/deleteById")
    public int deleteByPrimaryKey(Long userId) {
        return userService.deleteByPrimaryKey(userId);
    }
    @GetMapping("/deleteByExample")
    public int deleteByExample(UserExample example) {
        return userService.deleteByExample(example);
    }

    @PostMapping("/updateById")
    public int updateByPrimaryKey(User user) {
        return userService.updateByPrimaryKey(user);
    }
    @PostMapping("/updateByExample")
    public int updateByExample(User record, UserExample example) {
        return userService.updateByExample(record,example);
    }

    @GetMapping("/selectByExample")
    public List<User> selectByExample(UserExample example) {
        return userService.selectByExample(example);
    }
    @GetMapping("/selectByPrimaryKey")
    public User selectByPrimaryKey(Long userId) {
        return userService.selectByPrimaryKey(userId);
    }


}
