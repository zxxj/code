package com.xin.polymorphism.demo2;

public class Test {
    public static void main(String[] args) {

        /*
        * 多态的好处:
        *   1.在多态形势下,等号右边的对象时解耦合的,更便于维护与扩展
        *   2.在定义方法时,使用父类型作为形参,那么该方法就可以接受该父类型的所有子类对象
        * */

        useAnimal(new Dog());
         useAnimal(new Cat());

        // 多态的弊端: 不能直接使用子类中特有的功能


    }

    public static void useAnimal(Animal a) {
        a.eat();
        // 多态的弊端: 不能直接使用子类中特有的功能
        // a.lookHome(); // 报错

        // 如果非要使用子类的特有功能,可以使用强转
        // Dog dog = (Dog) a;
        // dog.lookHome(); // 小狗会看家

        /*
         强转可能会存在风险:
         如果转为父类引用记录的真实子类对象,那么不会报错,否则会报ClassCastException

         如果避免这个风险?
            使用instanceOf关键字, 他可以判断左边的变量是不是右边的类型,返回boolean值
         */

        if(a instanceof Dog) {
            Dog dog = (Dog) a;
            dog.lookHome(); // 小狗会看家
        }
    }
}
