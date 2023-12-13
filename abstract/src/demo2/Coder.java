package demo2;

public class Coder extends Person{
    public Coder() {
    }

    public Coder(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("coder~");
    }
}
