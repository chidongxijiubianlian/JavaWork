package com.mypackage.service;

import com.mypackage.dao.JsrDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Service
public class JsrService {
    @Resource
    private JsrDao jsrDao;
    public void save()
    {
        jsrDao.save();
    }
    @PostConstruct
    public void before()
    {
        System.out.println("before()");
    }
    @PreDestroy
    public void after()
    {
        System.out.println("after()");
    }
}
