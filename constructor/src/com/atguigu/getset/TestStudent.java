package com.atguigu.getset;

public class TestStudent {
    public static void main(String[] args) {

        Student s = new Student();

        s.setName("dusk");
        s.setAge(18);

        System.out.println("名字:" + s.getName() + " 年龄: " + s.getAge()); // 名字dusk 年龄18
    }
}
