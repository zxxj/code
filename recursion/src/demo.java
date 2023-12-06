public class demo {
    public static void main(String[] args) {

        System.out.println(Recursion.f(9));
    }
}

class Recursion {

    // 斐波那契数列
    public static int f(int n){
        if(n <= 2) return 1;
        return f(n - 1) + f(n - 2);
    }
}