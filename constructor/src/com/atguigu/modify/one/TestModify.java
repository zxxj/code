package com.atguigu.modify.one;

public class TestModify {
    public static void main(String[] args) {

        // 在同一个包中的其他类中,除了private修饰的都可以访问到
        Father f = new Father();
       //  System.out.println("a:" + f.a); // 访问不到private
        System.out.println("b:" + f.b); // 可以访问
        System.out.println("c:" + f.c); // 可以访问
        System.out.println("d:" + f.d); // 可以访问
    }
}
