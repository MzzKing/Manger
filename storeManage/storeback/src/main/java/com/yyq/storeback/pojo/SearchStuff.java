package com.yyq.storeback.pojo;

import lombok.Data;

@Data
public class SearchStuff {
    private Integer employeeID;
    private String employeeName;
    private String country;
    private String address;
    private Integer employeeAge_low;
    private Integer employeeAge_high;
    private Integer seniority_low;
    private Integer seniority_high;
}
