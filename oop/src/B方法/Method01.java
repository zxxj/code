package B方法;

public class Method01 {
    public static void main(String[] args) {

        // 方法不会默认执行,需要创建一个实体,然后进行调用方法才会被执行
        Person p = new Person();
        p.speak();
        p.sum();
        p.sumN(5);
        int result = p.sum2(1,2);
        System.out.println(result);
    }
}

class Person {
    // 成员方法
    public void speak() {
        System.out.println("hello dusk~");
    }

    // 计算1-1000的和
    public void sum() {
        int res = 0;
        for (int i = 1; i <= 1000; i ++) {
            res += i;
        }
        System.out.println(res);
    }

    // 计算1 + n的和
    public void sumN(int n) {
        int res = 0;
        for (int i = 0; i <= n; i++) {
            res += i;
        }
        System.out.println(res);
    }

    // 计算n + y的和
    public int sum2(int n, int y) {
        return n + y;
    }
}
