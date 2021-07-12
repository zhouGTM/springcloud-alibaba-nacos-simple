package com.zjtech.serviceconsumer.vo;

import java.io.Serializable;

/**
 * @Author: zhoujian
 * @Description: TODO
 * @Date: 2021/7/12 10:37
 */
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String username;

    private String password;

    private String realname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }
}
