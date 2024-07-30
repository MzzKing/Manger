package com.yyq.storeback.pojo;

import lombok.Data;

@Data
public class Merchant {
    private Integer merchantId;
    private String merchantName;
    private String merchantAddress;
    private String industry;
    private String brand;
    private String manageForm;
    private String businessScope;
}
