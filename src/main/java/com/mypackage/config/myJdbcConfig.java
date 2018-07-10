package com.mypackage.config;

import com.mypackage.bean.JdbcDriverManager;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration("myJdbcConfig")
@ImportResource("classpath:config.xml")
public class myJdbcConfig {
    @Value("${url}")
    public String url;
    @Value("${password}")
    public String password;
    @Value("${jdbc.userName}")
    public String userName;
    @Bean("jdbcDriverManager")
    public JdbcDriverManager getDriverManager()
    {
        JdbcDriverManager jdbcDriverManager = new JdbcDriverManager(url,password,userName);
        return jdbcDriverManager;
    }
}
