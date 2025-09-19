package practiceandnotes;

/**
 * ================= CONSTRUCTORS BASICS =================
 * A constructor is a special method used to initialize objects.
 * Key points:
 * - It has the same name as the class.
 * - No return type, not even void.
 * - It is called automatically when we create an object using new.
 * - You can have multiple constructors (constructor overloading).
 * - A constructor can call another constructor using this(...).
 * - A constructor of a subclass must call its parent’s constructor
 * (either explicitly with super(...) or implicitly with super()).
 * - If you define ANY constructor, the compiler does NOT provide a default one.
 * - Constructors can be overloaded but NOT overridden (they belong to the class, not inherited polymorphically).
 * - They can have any access modifier (public, private, protected, default).
 * Private constructors are often used in Singleton or Factory patterns.
 * Types of constructors:
 * - Default constructor (no-arg, provided by compiler if you don’t define any constructor).
 * - No-argument constructor (you define it explicitly, may add logic).
 * - Parameterized constructor (takes arguments to set fields).
 * - Copy constructor (not built-in, but can be created manually to clone an object).
 */

class Animal {
    // no constructor defined
    // compiler provides: Animal() {}
}

class Car {
    String model;
    int year;

    Car() {
        this("Unknown", 2000); // calls another constructor
    }

    Car(String model) {
        this(model, 2000);
    }

    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void log() {
        System.out.println(this.model + " " + this.year);
    }
}

public class ConstructorsDemo {
    public static void main(String[] args) {
        Animal animal = new Animal(); // calls default constructor

        Car car = new Car(); // calls no-arg constructor
        car.log(); // Unknown 2000

        Car bmw = new Car("BMW"); // calls parameterized constructor
        bmw.log(); // BMW 2000

        Car audi = new Car("Audi", 2015);
        audi.log(); // Audi 2015
    }
}
