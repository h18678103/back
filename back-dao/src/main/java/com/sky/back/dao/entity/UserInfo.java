package com.sky.back.dao.entity;

import org.hibernate.validator.constraints.NotBlank;

/**
 * @author huqinsong
 * @date 2018/11/12
 */
public class UserInfo {

    @NotBlank(message = "用户名不能为空！")
    private String username;

    @NotBlank(message = "密码不能为空！")
    private String password;


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
}
