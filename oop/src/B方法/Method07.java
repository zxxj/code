package B方法;

public class Method07 {
    public static void main(String[] args) {

        int num1 = 2;
        int num2 = 5;

        Test6 t = new Test6();
        t.swap(num1, num2);
        System.out.println("num1:" + num1); // 2
        System.out.println("num2:" + num2); // 5
    }
}

        class Test6 {
            public void swap(int a, int b){
                System.out.println("交换前:");
                System.out.println("a:" + a); // 2
                System.out.println("b:" + b); // 5
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a:" + a); // 5
        System.out.println("b:" + b); // 2
    }
}
