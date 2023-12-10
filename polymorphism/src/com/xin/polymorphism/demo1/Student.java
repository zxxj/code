package com.xin.polymorphism.demo1;

public class Student extends People{

    String name = "学生名字";
    @Override
    public void eat() {
        System.out.println("学生会吃饭");
    }
}
