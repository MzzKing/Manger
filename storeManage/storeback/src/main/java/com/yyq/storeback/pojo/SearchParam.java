package com.yyq.storeback.pojo;

import lombok.Data;

@Data
public class SearchParam {
    private Integer items_id;
    private String items_title;
    private Integer merchant_id;
    private Double price_low;
    private Double price_high;
    private Integer category;
    private String good_type;
    private Integer discontinued;
    private Integer sale_low;
    private Integer sale_high;
    private Integer status;
    private Integer is_expire;
}
