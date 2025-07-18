package study.oop.j120interfaceintro;

// A class can implement multiple interfaces.
class Car implements Vehicle {

    @Override
    public void move() {
        System.out.println("Car moves");
    }

    @Override
    public void stop() {
        System.out.println("Car stops");
    }

    @Override
    public void turn() {
        System.out.println("Car turns");
    }

    @Override
    public float getTopSpeed() {
        return 200;
    }
}

public class J120InterfaceIntro {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.move();

        // Vehicle vehicle = new Vehicle(); // nie można tworzyć obiektu interfejsu

    }
}
