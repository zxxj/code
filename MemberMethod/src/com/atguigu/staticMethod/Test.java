package com.atguigu.staticMethod;

public class Test {
    public static void main(String[] args) {

        Person p = new Person();
        p.name = "dusk";
        p.address = "地球人";

        System.out.println(p.testNoStatic());
        Person p2 = new Person();
        p2.name = "测试";
        p2.address = "火星人";

        System.out.println(p2.testStatic()); // 我的名字:dusk我的地址:地球人
    }
}
