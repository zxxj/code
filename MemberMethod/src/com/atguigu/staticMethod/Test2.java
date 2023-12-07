package com.atguigu.staticMethod;

public class Test2 {
    public static void main(String[] args) {

        Test3.test(); // 第一种方式,类名.

        Test3 t = new Test3();
        t.test(); // 第二种方式,通过新建对象,不推荐

    }
}

class Test3 {
    public static void test() {
        System.out.println("test");
    }
}