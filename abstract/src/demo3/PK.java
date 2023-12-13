package demo3;

abstract public class PK {

    public abstract void singName();
    public final void sing() {
        System.out.println("自我介绍");

        // 歌名
        singName();

        System.out.println("结束语");
    }
}
