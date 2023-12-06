package com.atguigu.method;

public class Person {
    String name; // 每个人都有名字

    // 每一个人都会吃饭
    public String eat() {
        return  "吃饭";
    }

    // 每一个人都会睡觉
    public String sleep() {
        return "睡觉";
    }

    // 谁会吃饭和睡觉
    public String getInfo() {
        // 本类(Person)中的非静态方法可以直接调用本类中的属性和其他非静态方法
        return name + "会" + eat() + "和" + sleep();
    }
}
