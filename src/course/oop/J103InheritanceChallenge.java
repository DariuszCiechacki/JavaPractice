package course.oop;

class Product {
    public float price;
    public String name;
    public String manufacturer;
    public int productionYear;

    Product() {
        this.name = "unknown";
        this.manufacturer = "unknown";
        this.price = 100.0f;
    }

    public void printData() {
        System.out.println("Price: " + price + "\n" + "Name: " + name + "\n" + "Manufacturer: " + manufacturer + "\n" + "Production year: " + productionYear);
    }
}

class Mouse extends Product {
    public int numberButtons;

    Mouse() {
        this.numberButtons = 3;
    }
}

class VerticalMouse extends Mouse {
    VerticalMouse() {
    }
}

class Monitor extends Product {
    public int resolution;

    Monitor() {
        this.resolution = 1080;
    }
}

class Keyboard extends Product {
    public int numKeys;

    Keyboard() {
        this.numKeys = 104;
        this.price = 50;
    }
}

class Computer extends Product {
    public Mouse mouse;
    public Monitor monitor;
    public Keyboard keyboard;

    Computer() {
        this.mouse = new Mouse();
        this.monitor = new Monitor();
        this.keyboard = new Keyboard();
        this.price = 1000.0f;
    }
}

public class J103InheritanceChallenge {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        VerticalMouse verticalMouse = new VerticalMouse();
        Monitor monitor = new Monitor();
        Keyboard keyboard = new Keyboard();
        Computer computer = new Computer();
        System.out.println(computer.monitor.resolution);
        System.out.println("Keyboard price: " + keyboard.price);
        System.out.println("Computer price " + computer.price);
    }
}
