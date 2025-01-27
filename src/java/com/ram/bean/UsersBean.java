/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ram.bean;

/**
 *
 * @author HP
 */
public class UsersBean {
    private int sid;
    private String name;
    private String userName;
    private String password;
    private String email;
    private String mobile;
    
    public UsersBean(){
        
    }

    public UsersBean(int sid, String name, String userName, String password, String email, String mobile) {
        this.sid = sid;
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.mobile = mobile;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    
}
