package com.xin.demo3;

public class Test {

    // 1.要在声明时完成赋值
    // private final int age = 10;
    private final int age;


    public Test(int age) {
        // 2.或者在构造器执行结束之前完成赋值
        this.age = 10;
    }

    // 被final修饰的局部变量只能被赋值一次
    public void testMethod() {
        final int sum = 10;
        // sum = 20;
    }
}
