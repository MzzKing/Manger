package com.yyq.storeback.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Product {
    private Integer ProductID;
    private String ProductName;
    private String ProductTitle;
    private Integer SupplierID;
    private Integer CategoryID;
    private Double Price;
    private Integer Stock;
    private Integer UnitsOnOrder;
    private Integer saleVolume;
    private Integer Discontinued;
    private Integer status;
    private String ItemType;
    private Integer isExpire;
    private Date createTime;
    private Date groundingTime;
}
