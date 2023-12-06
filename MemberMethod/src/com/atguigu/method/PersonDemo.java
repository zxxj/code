package com.atguigu.method;

public class PersonDemo {
    public static void main(String[] args) {

        Person p = new Person();
        p.name = "dusk";
        System.out.println(p.getInfo()); // dusk会吃饭和睡觉
    }
}
