public class overLoad01 {
    public static void main(String[] args) {
        // 方法重载

        /*
        *   需求: 在同一个类中,声明如下几个方法
        *        1.可以求2个整数的最大值
        *        2.可以求3个整数的最大值
        *        3.可以求2个小数的最大值
        * */

        System.out.println(testMethod(10, 20)); // public static int testMethod(int a, int b)

        System.out.println(testMethod(10, 20, 30)); // public static int testMethod(int a, int b, int c)

        System.out.println(testMethod(2.2, 3.3)); // public static double testMethod(double a, double b)

        System.out.println(testMethod(99, 66.6)); //  public static double testMethod(double a, double b)

        // System.out.println(testMethod(6,8,6.6)); // 报错,没有匹配的
    }

    public static int testMethod(int a, int b) {
        return a > b ? a : b;
    }

    public static int testMethod(int a, int b, int c) {
        int max = a > b ? a : b;
        max = max > c ? max : c;
        return  max;
    }

    public static double testMethod(double a, double b) {
        return a > b ? a : b;
    }

    // 仅仅是返回值不同,但方法名和参数相同,这样的方法不是重载方法
    public static double testMethod(int a, int b) {
        return a > b ? a : b;
    }
}
