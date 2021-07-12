package com.zjtech.serviceprovider.service;

import com.zjtech.serviceprovider.dao.UserDao;
import com.zjtech.serviceprovider.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: zhoujian
 * @Description: 用户相关业务
 * @Date: 2021/7/12 9:56
 */

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public User getUserInfo(int uid) {
        return userDao.selectByPrimaryKey(uid);
    }
}
