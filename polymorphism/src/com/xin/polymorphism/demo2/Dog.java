package com.xin.polymorphism.demo2;

public class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("小狗吃肉");
    }

    public void lookHome() {
        System.out.println("小狗会看家");
    }
}
