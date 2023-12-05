public class demo1 {

    public static void main(String[] args) {

        max(1,2); // max(int a, int b)被调用
        max(10,20,30); // max(int a, int b, int c))被调用
       int max =  max(10, 20, 4, 30); // int max(int ... args)
        System.out.println(max);

//        test(); // 没有传入实参
//        test(99); // 传入一个实参
//        test(10,20,30); // 传入n个实参

        // 可变参数的实参可以是对应类型的数组对象
//        int[] arr = {1,2,3,4,5};
//        test(arr);

        test(); // 传入0个实参时,相当于 new int[]{}
        test(); // 传入0个实参时,相当于 new int[0]

        // 传入n个元素,是如何变成数组的?
        test(1,2,3,4,5); // 底层做了处理,处理后相当于new int []{1,2,3,4,5}

    }

    public static int max(int a, int b) {
        System.out.println("max(int a, int b)被调用");
        return a > b ? a : b;
    }

    public static int max(int a, int b, int c) {
        System.out.println("max(int a, int b, int c))被调用");
        int max = a > b ? a : b;
        return max > c ? max : c;
    }

    public static int max(int num, int ... args) {
        System.out.println("max(int ... args)被调用");
        int max = num;

        for(int i = 0; i < args.length; i ++) {
            if(max < args[i]){
                max = args[i];
            }
        }
        return max;
    }

    // 1.一个方法最多只能声明一个可变参数
    //    public static test(int ... args2, int ... args) {}

    // 2.可变参数只能是形参列表的最后一个参数
    //    public static test(int ... args, int a) {}

    // 3.可变参数的形参可以当成数组使用
    //    public static int test(int ... args) {
    //        System.out.println(args[0]); // 10
    //        System.out.println(args[1]); // 20
    //        System.out.println(args[2]); // 30
    //        return 1;
    //    }

    // 4.可变参数的实参可以是0~n个元素
    //    public static int test(int ... args) {
    //        int sum = 0;
    //        for (int i = 0; i < args.length; i++) {
    //            sum += args[i];
    //        }
    //        System.out.println(sum);
    //        return sum;
    //    }

    // 5.不会构成重载
    //    public static int test(int ... args) {
    //        return  1;
    //    }
    //
    //    public static int test(int[] args) {
    //        return 1;
    //    }

    // 6.可变参数列表,如果传入0个元素,数组是什么样的?
    public static void test(int ... args) {}

}
