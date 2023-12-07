package com.atguigu.modify.two;

import com.atguigu.modify.one.Father;

public class OtherClass {
    public static void main(String[] args) {

        // 在其他包的非子类中,除了public,其他权限修饰符均不可见
        Father otherF = new Father();
        // System.out.println("a:" + otherF.a); // 访问不到
        // System.out.println("b:" + otherF.b); // 访问不到
        // System.out.println("c:" + otherF.c); // 访问不到
        System.out.println("d:" + otherF.d); // 可以访问
    }
}
