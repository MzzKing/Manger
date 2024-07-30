package com.yyq.storeback.pojo;

import lombok.Data;

import java.sql.Timestamp;
import java.util.Date;

@Data
public class User {
    private Integer userId;
    private String username;
    private String password;
    private Integer role;
    private String nickname;
    private String avatar;
    private Integer sex;
    private String phone;
    private String email;
    private Integer emailVerified;
    private String realName;
    private String idCard;
    private Date birthday;
    private String introduction;
    private Integer status;
    private Integer deleted;
    private Timestamp createTime;
    private Timestamp updateTime;
}
