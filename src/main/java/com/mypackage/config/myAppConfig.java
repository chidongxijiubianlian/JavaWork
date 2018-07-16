package com.mypackage.config;

import com.mypackage.bean.TestInitDestory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class myAppConfig {
    @Bean
    public TestInitDestory show()
    {
        System.out.println("这里是config的show方法");
        return new TestInitDestory();
    }
}
