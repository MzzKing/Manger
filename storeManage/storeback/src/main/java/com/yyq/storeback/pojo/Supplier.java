package com.yyq.storeback.pojo;

import lombok.Data;

@Data
public class Supplier {
    private Integer SupplierID;
    private String CompanyName;
    private String ContactName;
    private String ContactTitle;
    private String Address;
    private String City;
    private String Region;
    private String PostalCode;
    private String Country;
    private String Phone;
    private String HomePage;
}
