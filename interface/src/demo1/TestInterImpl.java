package demo1;

public class TestInterImpl implements TestInter, TestInterB{
    @Override
    public void eat() {
        System.out.println("实现后的eat方法");
    }

    @Override
    public void run() {
        System.out.println("实现后的run方法");
    }
}
