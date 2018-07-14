package com.mypackage.bean;
public class JdbcDriverManager {
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
