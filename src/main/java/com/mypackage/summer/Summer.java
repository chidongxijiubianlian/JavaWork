package com.mypackage.summer;

import java.util.HashMap;
import java.util.Map;

public class Summer {
    private static Summer ourInstance = new Summer();
    private static Map<String,Object> summerMap = new HashMap<>();

    public static Summer getInstance() {
        return ourInstance;
    }

    public void add(String key,Object value)
    {
        summerMap.put(key,value);
    }
    public Object resolve(String key)
    {
        return summerMap.get(key);
    }
    private Summer() {

    }
}
