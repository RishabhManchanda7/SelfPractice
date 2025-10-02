abstract class Vehicle {
    public void startEngine() {
        System.out.println("Engine Started");
    }
}
public class Car extends Vehicle {
    private String color;

    public Car() {
        this.color = "white";
    }

    public void printDetails() {
        System.out.println("Car color: " + this.color);
    }

    public static void main(String[] args) {
        Car car = new Car();

        car.printDetails();
        car.startEngine();
    }
}