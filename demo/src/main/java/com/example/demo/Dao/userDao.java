package com.example.demo.Dao;

import org.springframework.stereotype.Repository;

@Repository
public class userDao {
    String username;
    String password;


    
    @Override
    public String toString() {
        return "userDao [username=" + username + ", password=" + password + "]";
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
    
    
}
