package com.shop2.pojo;

import java.io.Serializable;

public class TbUser implements Serializable{
    private Integer id;

    private String username;

    private String password;

    private Integer js;

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
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getJs() {
        return js;
    }

    public void setJs(Integer js) {
        this.js = js;
    }
}