package A引出类与对象;

public class object02 {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.name = "奥迪A6";
        car1.price = 229999.88;
        car1.color = "黑色";
    }
}

class Car {
    String name;
    double price;
    String color;
    String[] master;
}