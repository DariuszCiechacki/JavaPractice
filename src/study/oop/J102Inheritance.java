package study.oop;

/**
 * Dziedziczenie to mechanizm, w którym jedna klasa (dziecko lub podklasa)
 * przejmuje właściwości (pola) i zachowania (metody) innej klasy (nadrzędnej lub superklasy).
 * Promuje to ponowne wykorzystanie kodu, rozszerzalność i polimorfizm.
 */

//Klasa bazowa (parent class)
class Vehicle {
    public String type;
    public int numWheels;
    public float topSpeed;
}

//Klasa potomna (child class) klasy bazowej (parent class) Vehicle
class Bicycle extends Vehicle {
    public void printInfo() {
        System.out.println("Type: " + this.type + "\n" + "Top speed: " + this.topSpeed);
    }
}

//Klasa potomna (child class) klasy bazowej (parent class) Vehicle
class Scooter extends Vehicle {
    public void printInfo() {
        System.out.println("Type: " + this.type + "\n" + "Top speed: " + this.topSpeed);
    }
}

public class J102Inheritance {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.type = "Bmx";
        bicycle.topSpeed = 15.0f;
        bicycle.printInfo();

        Scooter scooter = new Scooter();
        scooter.type = "Scooter";
        scooter.topSpeed = 30.0f;
        scooter.printInfo();
    }
}
