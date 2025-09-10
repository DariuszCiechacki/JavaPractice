package course.oop;

class Phone {
    String manufacturer;
    String model;
    String color;
    int productionYear;
    float price;

    public Phone(String manufacturer, String model, String color, int productionYear, float price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.color = color;
        this.productionYear = productionYear;
        this.price = price;
    }

    public Phone() {
        this.manufacturer = "Unknown";
        this.model = "Unknown";
    }

    public void printInfo() {
        System.out.println(this.manufacturer + " " + this.model + " " + this.productionYear);
    }
}

public class J87Constructors {
    public static void main(String[] args) {
        Phone iPhone = new Phone("Apple", "16e", "blue", 2025, 2499.0f);
        iPhone.printInfo();

        Phone xiaomi = new Phone();
        xiaomi.printInfo();
    }
}
