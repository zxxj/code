package A引出类与对象;

public class object05 {
    public static void main(String[] args) {

        // 思考: 会输出什么信息?
        Person2 a = new Person2();
        a.name = "dusk";
        a.age = 18;

        Person2 b = a;
        System.out.println(b.name); // dusk

        b.age = 200;
        b = null;

        System.out.println(a.age); // 200
//        System.out.println(b.age); // 异常

        // 见: 03.对象内存分配练习二
    }
}

class Person2 {
    String name;
    int age;
}