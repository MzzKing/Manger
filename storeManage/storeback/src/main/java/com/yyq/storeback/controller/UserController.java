package com.yyq.storeback.controller;

import com.yyq.storeback.pojo.ResData;
import com.yyq.storeback.pojo.User;
import com.yyq.storeback.service.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Controller
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @ResponseBody
    @GetMapping("/user/{id}")
    @CrossOrigin
    public User getUser(@PathVariable("id") Integer id){
        return userService.getUser(id);
    }

    @ResponseBody
    @CrossOrigin
    @PostMapping("/loginUser")
    public ResData loginUser(@RequestBody Map<String, Object> map, HttpServletRequest request, HttpServletResponse response){
        String username = (String) map.get("username");
        String password = (String) map.get("password");
        User user = userService.getUserByUsername(username);
        ResData resData = new ResData();
        if (user == null){
            String flag = "账号不存在";
            resData.setFlag(flag);
            resData.setData(null);
        }else {
           if (user.getPassword().equals(password)){
               String flag = "success";
               resData.setFlag(flag);
               resData.setData(user);
           }else {
               String flag = "密码错误";
               resData.setFlag(flag);
               resData.setData(null);
           }
        }
        return resData;
    }

    @ResponseBody
    @CrossOrigin
    @PutMapping ("/registerUser")
    public ResData registerUser(@RequestBody Map<String, Object> map){
        ResData resData = new ResData();
        String username = (String) map.get("username");
        String password = (String) map.get("password");
        String email = (String) map.get("email");
        Integer role = Integer.parseInt((String) map.get("role"));

        userService.insertUser(username,password,role,email);


        String flag = "success";
        resData.setFlag(flag);
        return resData;
    }

}
