package com.mypackage.bean;

public class TestInitDestory  {
    private void init()
    {
        System.out.println(this.getClass().getName()+"init");
    }
    private void destroy()
    {
        System.out.println(this.getClass().getName()+"destroy");
    }
    public void show()
    {
        System.out.println("这是TestInitDestory实例中的show方法");
    }
}
