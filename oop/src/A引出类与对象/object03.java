package A引出类与对象;

public class object03 {
    public static void main(String[] args) {

        // 对象中属性的默认值遵循数组规则!!
        Person p = new Person();
        System.out.println("name:" + p.name); // null
        System.out.println("age:" + p.age); // 0
        System.out.println("height:" + p.height); // 0.0
        System.out.println("isTrue:" + p.isTrue); // false
    }
}

class Person {
    String name;
    int age;
    boolean isTrue;
    double height;
}
