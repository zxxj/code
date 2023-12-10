package com.atguigu.inherit.toString;

public class TestRectangle {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(10,20);
        System.out.println(r.toString());// com.atguigu.inherit.toString.Rectangle@1134affc

        System.out.println(r); //重写toString后: Rectangle{length=10.0, width=20.0}
    }
}
