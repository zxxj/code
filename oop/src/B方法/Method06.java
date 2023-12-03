package B方法;

public class Method06 {
    public static void main(String[] args) {
        Test5 t = new Test5();
        boolean isEven = t.isEvenNumber(11);
        System.out.println(isEven);

        t.printChar(4,4,'#');

    }
}

class Test5 {
    // 1.判断一个数是奇数还是偶数,返回boolean
    public boolean isEvenNumber(int number) {
        return number % 2 == 0 ? true : false;
    }

    // 2.根据行、列、字符打印对应行数和列数的字符，比如:行:4，列:4，字符#,则打印相应的效果
    public void printChar(int row, int column, char n) {
        for (int i = 0; i < row; i ++) {
            for (int j = 0; j < column; j ++) {
                System.out.print(n);
            }
            System.out.println();
        }
    }
}
