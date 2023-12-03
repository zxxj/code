package B方法;

public class Method05 {
    public static void main(String[] args) {
        Test3 t = new Test3();
        t.sayOk();
        t.printSayHello();
    }
}

class Test3 {
    public void print() {
        System.out.println("ok");
    }
    // 1.在同一个类中的方法调用: 直接调用即可
    public void sayOk() {
        print();
    }

    // 2.跨类调用方法,例如调用Test4中的sayHello方法如何实现?
    public void printSayHello() {
        Test4 t = new Test4();
        t.sayHello();
    }
}

class Test4 {
   public void  sayHello() {
        System.out.println("hello");
    }
}
