package study.oop.j92returnchallenge;

public class Car {
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
