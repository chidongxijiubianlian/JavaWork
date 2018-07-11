package com.mypackage.beanannotation.impl;

import com.mypackage.beanannotation.IStore;

public class StringStore implements IStore<String> {
    @Override
    public void show() {
        System.out.println("我是StringStore");
    }
}
