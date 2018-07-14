package com.mypackage.dao;

import org.springframework.stereotype.Repository;

@Repository
public class JsrDao {
    public void save()
    {
        System.out.println("this is "+this.getClass().getName()+"的"+this.getClass().getMethods()[0].getName()+"方法");
    }
}
