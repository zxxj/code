public class MarryTest {
    public static void main(String[] args) {

        Wife w = new Wife();
        w.name = "小红";

        Hubby h = new Hubby();
        h.name = "小白";

        h.wife = w;
        w.hubby = h;
        System.out.println("丈夫的姓名:" + h.name);
        System.out.println("妻子的姓名:" + w.name);
        System.out.println("该丈夫的妻子姓名:" + h.wife.name );
        System.out.println("该妻子的丈夫姓名:" + w.hubby.name);
    }
}
