package com.atguigu.inherit;


public class TestStudent {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "dusk";
        s.age = 18;
        System.out.println(s.study()); // 我爱学习~
        System.out.println(s.name); // dusk
        System.out.println(s.age); // 18
    }
}
