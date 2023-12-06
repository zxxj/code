package com.atguigu.staticMethod;

public class Person {
     String name;
     static String address;

    public String testNoStatic() {
        return "我的名字:" + name + "我的地址:" + address;
    }

    public String testStatic() {
        return "我的名字:" + name + "我的地址:" + address;
    }
}
