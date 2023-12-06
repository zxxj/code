package com.atguigu.exer;

public class TestRectangle {
    public static void main(String[] args) {

        Rectangle r = new Rectangle();
        r.length = 3.14;
        r.width = 5.5;
        System.out.println(r.getInfo());

        Rectangle r2 = new Rectangle();
        r2.length = 2.33;
        r2.width = 3.33;
        System.out.println(r2.getInfo());
    }
}
