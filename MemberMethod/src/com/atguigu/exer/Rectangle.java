package com.atguigu.exer;

public class Rectangle {

    double length;
    double width;

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length * width);
    }

    public String getInfo() {
        return "周长是:" + area() + "面积是:" + perimeter();
    }
}
