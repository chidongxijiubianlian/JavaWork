package com.mypackage.beanannotation.impl;

import com.mypackage.beanannotation.IBeanInterface;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;
@Order(2)
@Service
public class BeanImplA implements IBeanInterface {
    @Override
    public void show() {
        System.out.println("这是A");
    }
}
