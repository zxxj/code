package com.atguigu.modify.one;

public class Father {

    private String a;
    int b;
    protected double c;
    public String d;

    public void test() {

        // 在本类中都可以访问到
        System.out.println("a: " + a); // 可以访问
        System.out.println("b: " + b); // 可以访问
        System.out.println("c: " + c); // 可以访问
        System.out.println("d: " + d); // 可以访问
    }
}
