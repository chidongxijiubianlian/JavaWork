package com.mypackage.bean;

import com.mypackage.annotation.YzInspect;
import org.springframework.stereotype.Component;

@YzInspect
@Component
public class JdbcDriverManager {
    public JdbcDriverManager()
    {

    }
    public JdbcDriverManager(String password,String url,String userName)
    {
        System.out.println("password:"+password);
        System.out.println("url:"+url);
        System.out.println("userName:"+userName);
    }
    public void show()
    {
        System.out.println("JdbcDriverManager中的show方法");
    }
}
