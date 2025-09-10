package course.oop;

class Truck {
    final int TOP_SPEED = 100;
    final int ACCELERATION;
    String manufacturer;
    String model;
    int numWheels;
    String color;

    Truck() {
        this.manufacturer = "Freigtliner";
        this.model = "9664";
        this.numWheels = 6;
        this.ACCELERATION = 60;
    }

    Truck(String color) {
        this();
        this.color = color;
    }

    public void printInfo() {
        System.out.println("Producer: " + this.manufacturer + ", Model: " + this.model + ", Color: " + this.color);
    }
}

public class J97FinalWordChallenge {
    public static void main(String[] args) {
        Truck truck = new Truck("red");
        truck.printInfo();
    }
}
