package com.yyq.storeback.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Stuff {
    private Integer EmployeeID;
    private String EmployeeName;
    private Integer EmployeeAge;
    private Date BirthDate;
    private String Address;
    private String Country;
    private String HomePhone;
    private String Photo;
    private String Notes;
    private String Seniority;
}
