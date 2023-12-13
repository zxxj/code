package demo2;

public class Manager extends Person{
    private double bonus;
    public Manager() {
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, int age, double bonus) {
        super(name, age);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("Manager~");
    }
}
