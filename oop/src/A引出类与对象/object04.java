package A引出类与对象;

public class object04 {
    public static void main(String[] args) {
        // 思考: p2.age是多少?
        Person1 p1 = new Person1();
        p1.name = "dusk";
        p1.age = 18;

        Person1 p2 = p1;
        System.out.println(p2.age); // 18

        // 见: 02.类和对象的内存分配机制.png
    }
}

class Person1 {
    String name;
    int age;
}
