package demo1;

public class Demo {
    public static void main(String[] args) {

        // 具体类创建的对象
        Student s = new Student();
        s.work();

        // 多态创建对象
        Person p = new Student();
        p.work();
    }
}
