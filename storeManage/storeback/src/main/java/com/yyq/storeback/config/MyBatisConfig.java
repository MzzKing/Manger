package com.yyq.storeback.config;



import com.github.pagehelper.PageHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

@Configuration
public class MyBatisConfig {

    @Bean
    public PageHelper pageHelper() {
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty("reasonable","true");
        properties.setProperty("supportMethodsArguments","true");
        properties.setProperty("returnPageInfo","check");
        properties.setProperty("params","count=countSql");
        pageHelper.setProperties(properties);

        return pageHelper;
    }
}
