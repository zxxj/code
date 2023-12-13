package demo1;
// 3.抽象类最主要的特点: 抽象类不能被实例化, 它仅作为一种特殊的类,让子类继承并实现
 public class Student extends Person{

    // 4.抽象类的子类,要么重写抽象类中的所有抽象方法,要么将自己也声明为抽象类

    @Override
    public void work() {
        System.out.println("学生不工作");
    }
}
