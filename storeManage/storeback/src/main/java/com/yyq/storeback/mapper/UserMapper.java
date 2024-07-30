package com.yyq.storeback.mapper;

import com.yyq.storeback.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    public User getUser(Integer id);

    public User getUserByUsername(String username);

    public void insertUser(String username,String password,Integer role,String email);
}
