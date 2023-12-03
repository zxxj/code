package B方法;

public class Method03 {
    public static void main(String[] args) {

        Test test = new Test();
        int[] result = test.test1(5, 3);
        System.out.println("求和:" + result[0]);
        System.out.println("求差:" + result[1]);

        double result2 = test.test2(1, 2);
        System.out.println(result2);

        test.test3(5,6);
    }
}

class Test {

    // 1.一个方法最多有一个返回值 [思考，如何返回多个结果 返回数组 ]
    public int[] test1(int a, int b) {
        int[] res = new int[2];
        res[0] = a + b;
        res[1] = a - b;
        return res;
    }

    // 2.返回类型可以为任意类型，包含基本类型或引用类型(数组，对象) 参考test1

    // 3.如果方法要求有返回数据类型，则方法体中最后的执行语句必须为 return 值;
    // 而且要求返回值类型必须和 return 的值类型一致或兼容
    public double test2(int a, int b) {
        int res = 123;
        return res;
    }

    // 4.如果方法的返回值是 void，则方法体中可以没有 return 语句，或者 只写 return ;
    public void test3(int a, int b) {
        System.out.println("没有返回值");
        return;
    }
}
