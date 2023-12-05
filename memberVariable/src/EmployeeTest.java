public class EmployeeTest {
    public static void main(String[] args) {

        MyDate date = new MyDate();

        Employee e1 = new Employee();
        e1.birthday = date;
        e1.name = "dusk";
        e1.birthday.year = 2000;
        e1.birthday.month = 9;
        e1.birthday.day = 11;

        System.out.println("e1员工的信息:" +
                "姓名:" + e1.name + "," +
                " 年:" + e1.birthday.year + "," +
                " 月:" + e1.birthday.month + "," +
                " 日:" + e1.birthday.day); // e1员工的信息:姓名:dusk, 年:2000, 月:9, 日:11

        Employee e2 = new Employee();
        e2.birthday = date;
        e2.name = "测试";
        e2.birthday.year = 1888;
        e2.birthday.month = 8;
        e2.birthday.day = 28;

        System.out.println("e2员工的信息:" +
                "姓名:" + e2.name + "," +
                " 年:" + e2.birthday.year + "," +
                " 月:" + e2.birthday.month + ", " +
                "日:" + e2.birthday.day); // e2员工的信息:姓名:测试, 年:1888, 月:8, 日:28
    }
}
