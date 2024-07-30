package com.yyq.storeback.service.serviceImpl;

import com.yyq.storeback.mapper.UserMapper;
import com.yyq.storeback.pojo.User;
import com.yyq.storeback.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public User getUser(Integer id) {
        return userMapper.getUser(id);
    }

    @Override
    public User getUserByUsername(String username) {
        return userMapper.getUserByUsername(username);
    }

    @Override
    public void insertUser(String username,String password,Integer role,String email) {
        userMapper.insertUser(username,password,role,email);
    }

}
