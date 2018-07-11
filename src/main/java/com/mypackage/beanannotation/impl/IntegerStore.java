package com.mypackage.beanannotation.impl;

import com.mypackage.beanannotation.IStore;

public class IntegerStore implements IStore<Integer> {
    @Override
    public void show() {
        System.out.println("我是IntegerStore");
    }
}
