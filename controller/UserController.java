package com.ecdata.demo.controller;
import com.ecdata.demo.pojo.User;
import com.ecdata.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public int add(User user) {
        return userService.add(user);
    }
}
