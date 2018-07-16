package com.mypackage.bean;

import com.mypackage.annotation.YzInspect;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
@YzInspect
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
