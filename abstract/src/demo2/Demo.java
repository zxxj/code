package demo2;

public class Demo {
    public static void main(String[] args) {

        Person coder = new Coder("xin", 18);
        System.out.println(coder.getName()); // xin
        System.out.println(coder.getAge()); // 18
        coder.work(); // coder~

        Person manager = new Manager("manager", 22, 1000);
        System.out.println(manager.getName()); // manager
        System.out.println(manager.getAge()); // 22
        manager.work(); // 1000
    }
}
