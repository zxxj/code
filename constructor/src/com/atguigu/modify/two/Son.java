package com.atguigu.modify.two;

import com.atguigu.modify.one.Father;

public class Son extends Father {

    public void show(){
         // 在其他包的子类中,不能直接访问父类的private和缺省的成员
        // System.out.println("a:" + a); // 访问不到
        //System.out.println("a:" + b); // 访问不到
        // System.out.println("a:" + c); // 可以访问
        System.out.println("a:" + d); // 可以访问
    }
}
