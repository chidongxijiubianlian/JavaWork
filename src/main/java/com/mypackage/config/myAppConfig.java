package com.mypackage.config;

import com.mypackage.bean.TestInitDestory;
import com.mypackage.beanannotation.impl.BeanImplA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class myAppConfig {
    @Bean(value = "myAppConfig.show",initMethod = "init",destroyMethod = "destroy")
    public TestInitDestory show()
    {
        System.out.println("这里是config的show方法");
        return new TestInitDestory();
    }
}
