package com.yyq.storeback;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.yyq.storeback.mapper")
@SpringBootApplication
public class StorebackApplication {

    public static void main(String[] args) {
        SpringApplication.run(StorebackApplication.class, args);
    }

}
