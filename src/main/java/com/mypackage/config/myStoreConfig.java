package com.mypackage.config;

import com.mypackage.beanannotation.impl.IntegerStore;
import com.mypackage.beanannotation.impl.StringStore;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration("myStoreConfig")
@ImportResource("classpath:config.xml")
public class myStoreConfig {
    @Value("${proName}")
    public String proName;
    @Value("${proAddr}")
    public String proAddr;
    @Value("${proCount}")
    public String proCount;

    @Bean
    public IntegerStore integerStore()
    {
        return new IntegerStore();
    }
    @Bean
    public StringStore stringStore()
    {
        return new StringStore();
    }

}
