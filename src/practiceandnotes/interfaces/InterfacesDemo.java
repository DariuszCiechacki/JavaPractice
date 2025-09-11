package practiceandnotes.interfaces;

/**
 * ================= INTERFACE BASICS =================
 * An interface in Java is a contract (blueprint) that classes can implement.
 * It specifies WHAT a class must do, but not HOW.
 * Key points:
 * - Supports abstraction and multiple inheritance.
 * - All fields in an interface are implicitly:
 * public, static, final (constants)
 * - Allowed method types:
 * 1. Abstract methods (implicitly public, without body, must be implemented by the class.)
 * 2. Default methods (have a body, can be overridden by implementing classes)
 * 3. Static methods (belong to interface, called via InterfaceName.method)
 * 4. Private methods (helper methods, used inside interface only)
 * - Naming: often end with "...able" (Runnable, Comparable), "...Aware" (ApplicationContextAware),
 * or descriptive nouns (List, Map, Iterator).
 */
interface BaseInterface {

    // ========== CONSTANT FIELD ==========
    int LEGS = 4; // public static final by default
    // int age; ❌ Instance fields not allowed

    // ========== STATIC METHOD ==========
    static void info() {
        System.out.println("All animals share basic traits.");
    }

    // ========== ABSTRACT METHOD ==========
    void makeSound(); // must be implemented in implementing class

    // ========== DEFAULT METHOD ==========
    default void sleep() {
        log("Sleeping...");
    }

    // ========== PRIVATE METHOD ==========
    private void log(String message) {
        System.out.println("LOG: " + message);
    }
}

interface Pet extends BaseInterface {
    // ========== ABSTRACT METHOD ==========
    void beFriendly(); // must be implemented in implementing class
}

/**
 * ================= IMPLEMENTING INTERFACES =================
 * - A class implements an interface and provides implementations for abstract methods.
 * - A class can implement MULTIPLE interfaces (unlike classes).
 * - Default methods can be overridden with "InterfaceName.super.method()".
 */
public class InterfacesDemo implements Pet {

    // main for quick demo
    public static void main(String[] args) {
        InterfacesDemo dog = new InterfacesDemo();
        dog.makeSound();
        dog.beFriendly();
        dog.sleep();
        dog.showInfo();
    }

    // abstract method implementation
    @Override
    public void makeSound() {
        System.out.println("Woof! I’m a dog.");
    }

    // call a constant from interface
    public void dogsLegsNumber() {
        System.out.println("Dog has " + LEGS + " legs");
    }

    // abstract method implementation
    @Override
    public void beFriendly() {
        System.out.println("Wags tail happily.");
    }

    // Overriding default method (optional)
    @Override
    public void sleep() {
        Pet.super.sleep(); // calling parent's default method
    }

    // helper to show static method usage
    public void showInfo() {
        BaseInterface.info(); // called via interface name
    }
}
