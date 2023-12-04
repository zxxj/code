package B方法;

public class Mehotd09 {
    public static void main(String[] args) {

        Person2 p = new Person2();
        p.name = "dusk";
        p.age = 18;
        System.out.println("p.name:" + p.name + "p.age:" + p.age); //p.name:dusk p.age:18

        MyTools m = new MyTools();
        Person2 p2 = m.cloneTools(p);
        System.out.println("p2.name:" + p2.name + "p2.age:" + p2.age); //p2.name:dusk p2.age:18

        System.out.println("p的hashCode值:" + p); // @38082d64
        System.out.println("p2的hashCode值:" + p2); // @dfd3711

        System.out.println(p == p2); // false

    }
}

class Person2 {
    String name;
    int age;
}
class MyTools {
    public Person2 cloneTools(Person2 p) {
        Person2 p2 = new Person2();
        p2.name = p.name;
        p2.age = p.age;
        return p2;
    }
}
