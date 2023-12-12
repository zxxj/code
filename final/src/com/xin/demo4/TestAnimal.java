package com.xin.demo4;

public class TestAnimal {

    public static void main(String[] args) {

        final Animal a1 = new Animal("虎子", 18);
        System.out.println(a1.getName()); // 虎子
        System.out.println(a1.getAge()); // 18

        // 1.被final修饰的引用类型变量的地址值不能被改变
        // a1 = new Animal("小黑", 10); // 报错: 无法将值赋给 final 变量 'a1'

        // 2.但是地址中的成员可以被改变
        a1.setAge(20);
        a1.setName("虎子虎子");
        System.out.println(a1.getAge()); // 20
        System.out.println(a1.getName()); // 虎子虎子
    }
}
