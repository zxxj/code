public class MemberVariable {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "dusk";
        s1.age = 18;
        s1.score = 100;
        s1.phone = "18888888888";

        System.out.println("s1学生的姓名:" + s1.name); // "dusk"
        System.out.println("s1学生的年龄:" + s1.age); // 18
        System.out.println("s1学生的成绩:" + s1.score); // 100
        System.out.println("s1学生的手机号:" + s1.phone); // "18888888888"

        Student s2 = new Student();
        System.out.println("s2学生的姓名:" + s2.name); // null
        System.out.println("s2学生的年龄:" + s2.age); // 0
        System.out.println("s2学生的成绩:" + s2.score); // 0.0
        System.out.println("s2学生的手机号:" + s2.phone); // null
    }
}

class Student {
    String name;
    int age;
    double score;
    String phone;
}