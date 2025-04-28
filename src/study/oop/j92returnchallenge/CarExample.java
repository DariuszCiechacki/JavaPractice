package study.oop.j92returnchallenge;

public class CarExample {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car car1 = carFactory.buildCar();
        car1.printInfo();

        Car car2 = carFactory.buildCar();
        car2.printInfo();
    }
}
