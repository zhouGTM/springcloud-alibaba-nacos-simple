package com.zjtech.serviceprovider.controller;

import com.zjtech.serviceprovider.pojo.User;
import com.zjtech.serviceprovider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: zhoujian
 * @Description: 用户业务
 * @Date: 2021/7/12 9:57
 */

@RestController
public class UserController {

    @Autowired
    private UserService userService;

//    @Value("${server.port}")
//    private String port;

    @RequestMapping("/get/user")
    @ResponseBody
    public User getUserInfo(@RequestParam int uid) {
        return userService.getUserInfo(uid);
    }
}
