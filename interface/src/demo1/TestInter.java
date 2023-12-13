package demo1;

public interface TestInter {
    // 接口中定义的成员变量默认被public static final修饰,默认为常量
    public static final String name = "xin";

    // 接口中定义的方法默认是抽象方法, 默认被abstract修饰
    public abstract void eat();
}
