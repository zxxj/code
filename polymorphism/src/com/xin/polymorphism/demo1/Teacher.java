package com.xin.polymorphism.demo1;

public class Teacher extends People{
    String name = "老师名字";

    @Override
    public void eat() {
        System.out.println("老师会吃饭");
    }
}
