package A引出类与对象;

import java.util.Scanner;

public class object01 {
    public static void main(String[] args) {

        // 1.单独变量来解决
        // 第一只猫的信息
        String ca1Name = "小白";
        int cat1Age = 3;
        String cat1Color = "白色";

        // 第二只猫的信息
        String ca2Name = "小花";
        int cat2Age = 100;
        String cat2Color = "花色";

        Cat cat1 = new Cat();
        cat1.name = "小白";
        cat1.age = 3;
        cat1.color = "白色";

        Cat cat2 = new Cat();
        cat2.name = "小花";
        cat2.age = 100;
        cat2.color = "花色";

        System.out.println("第一只猫信息:" + "名字:" + cat1.name + ", 年龄:" + cat1.age + ", 颜色:" + cat1.color);
        System.out.println("第二只猫信息:" + "名字:" + cat2.name + ", 年龄:" + cat2.age + ", 颜色:" + cat2.color);
    }
}

// 2.使用oop面向对象来解决,类与对象

 class Cat {
    String name;
    int age;
    String color;
}