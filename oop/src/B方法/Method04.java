package B方法;

public class Method04 {
    public static void main(String[] args) {
        Test2 t = new Test2();
        int result = t.sum(10, 20);
        System.out.println(result); // 30

        int[] array = {1,2,3,4};
        int[] result2 = t.mapSum(array); //[I@1134affc 内存地址值
        System.out.println(result2);

        // t.sum2("哈哈", 123); // 参数类型报错
        t.sum2(18, "dusk");
    }
}

class Test2 {

    // 1.一个方法可以有0个参数,也可以有多个参数,中间用逗号隔开
    public int sum(int a, int b) {
        return a + b;
    }

    // 2.参数类型可以为任意类型,包含基本类型或引用类型
    public int[]  mapSum(int[] arr) {
        return arr;
    }

    // 3.调用带参数的方法时,传入的参数一定要对应形参列表相同的数据类型或兼容类型
    public void sum2(int a, String name) {
        System.out.println(a);
        System.out.println(name);
    }
}


