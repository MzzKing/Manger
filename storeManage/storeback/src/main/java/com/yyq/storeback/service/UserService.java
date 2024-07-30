package com.yyq.storeback.service;

import com.yyq.storeback.pojo.User;

public interface UserService {
    public User getUser(Integer id);

    public User getUserByUsername(String username);

    public void insertUser(String username,String password,Integer role,String email);

}
