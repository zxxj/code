package com.atguigu.objectArray;

public class ObjectArray {
    public static void main(String[] args) {

        Student[] students = { new Student(), new Student(), new Student() };

        // 为数组中的对象赋值
        students[0].name = "dusk";
        students[0].age = 18;

        students[1].name = "test";
        students[1].age = 19;

        for (int i = 0; i < students.length; i++) {
            // 访问属性
            // System.out.println(students[i].name + "" + students[i].age);

            // 访问方法
            System.out.println(students[i].getInfo());
        }
    }
}
