package com.xin.polymorphism.demo1;

public class Test {
    public static void main(String[] args) {

        People p1 = new Student();
        p1.eat(); // 学生会吃饭
        System.out.println(p1.name); // 人的姓名

        People p2 = new Teacher();
        p2.eat(); // 老师会吃饭
        System.out.println(p2.name); // 人的姓名
    }
}
