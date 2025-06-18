package study.oop;

class Car {
    String brand;
    String model;
    String color;

    public Car(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void printInfo() {
        System.out.println(this.brand + " " + this.model + " " + this.color);
    }
}

class CarFactory {

    public CarFactory() {
    }

    public Car buildCar() {
        String[] colors = {"red", "black", "white"};
        int randIndex = (int) Math.floor(Math.random() * colors.length);
        String randColor = colors[randIndex];

        return new Car("Ford", "Mustang", randColor);
    }
}

public class j92returnchallenge {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car car1 = carFactory.buildCar();
        car1.printInfo();

        Car car2 = carFactory.buildCar();
        car2.printInfo();
    }
}
