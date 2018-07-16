package com.mypackage.aops;

public class MySchemaAop {
    public void before()
    {
        System.out.println("aop在执行JdbcDriverManager任何方法前执行的before方法");
    }
}
