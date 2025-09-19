package practiceandnotes;

/**
 * ================= ABSTRACTS BASICS =================
 * An abstract class is a class that cannot be instantiated directly.
 * It is meant to be inherited by other classes. It can have:
 * - Abstract methods (methods without a body – only a declaration - need to be implemented by inheriting class).
 * - Concrete methods (normal methods with implementation).
 * - Fields (variables) – unlike interfaces.
 * - Constructors – but only used when called by subclasses.
 * - Static and final methods – but these cannot be abstract.
 * It is served as a blueprint that partially defines behavior, leaving some details for subclasses.
 */

// Abstract class (blueprint)
abstract class Shape {
    final String infoMessage = "Info message";
    // abstract class field
    String color;

    // Abstract class constructor
    Shape(String color) {
        this.color = color;
    }

    // abstract static something(); // Not allowed - static methods cannot be abstract as they do not belong to an instance

    // Static methods are tied to the abstract class conceptually, but don’t depend on subclass instances.
    static void displayInfo() {
        System.out.println("I am a shape!");
    }

    // Abstract method - without body - needs to be implemented by inheriting class
    abstract double area();

    // Abstract class concrete method with implementation
    void displayColor() {
        System.out.println("Color: " + color);
    }
}

// Subclass "Circle" which extends abstract class "Shape"
class Circle extends Shape {
    double radius;

    Circle(String color, double radius) {
        super(color); // Abstract constructor requires color parameter
        this.radius = radius;
    }

    // Abstract method from Abstract class that needs implementation
    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    void getInfos() {
        Shape.displayInfo(); // static method is accessible from subclasses
        System.out.println(infoMessage); // final field can be called
        // infoMessage = "hi"; // Modifying final field is not allowed
    }
}

// Test class
public class AbstractsDemo {
    public static void main(String[] args) {

        // Shape shape = new Shape(); // Not allowed - abstract class cannot be instantiated directly.
        Shape circle = new Circle("Red", 5); // Creates an instance of "Circle" class which extends "Shape" abstract class

        circle.displayColor(); // circle object has access to displayColor method as it extends abstract class where the method is defined
        System.out.println("Circle area: " + circle.area());
    }
}