package com.mypackage.beanannotation.impl;

import com.mypackage.beanannotation.IBeanInterface;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Order(3)
@Service
public class BeanImplC implements IBeanInterface {
    @Override
    public void show() {
        System.out.println("这是C");
    }
}
