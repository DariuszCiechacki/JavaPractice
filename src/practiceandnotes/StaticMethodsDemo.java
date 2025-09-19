package practiceandnotes;

/**
 * ================= STATIC METHODS BASICS =================
 * - A static method belongs to the class, not an instance of the class.
 * - It can be called without creating an object of the class.
 * - Declared with the keyword static.
 * - Often used for utility/helper methods (e.g., Math.max()).
 * Key rules:
 * - Can directly access other static variables and static methods in the class.
 * - Cannot directly access instance variables or instance methods (needs an object).
 * - Can be overloaded, but not overridden (they are bound at compile-time).
 * - If re-declared in a subclass, static methods are hidden, not overridden.
 * - Cannot use this and super as it need an object context, but static methods don’t run on objects.
 * Conventions:
 * - Static constants (static final) → UPPER_CASE_WITH_UNDERSCORES
 * - Other static fields → camelCase
 * - Static methods → camelCase starting with a verb
 */

class Student {
    // Static constant (naming convention: UPPER_CASE_WITH_UNDERSCORES)
    public static final int MAX_STUDENTS = 100;

    // shared across ALL Student objects
    private static int numberOfStudents = 0;

    private String specialization;

    public Student(String specialization) {
        this.specialization = specialization;
        numberOfStudents++;
        logCreation(specialization); // private static helper method
    }

    // static method to get shared info
    public static int getTotalStudents() {
        return numberOfStudents;
    }

    // private static helper method (cannot be accessed outside the class)
    private static void logCreation(String specialization) {
        System.out.println("New student created in specialization: " + specialization);
    }
}

public class StaticMethodsDemo {
    public static void main(String[] args) {
        // Creating objects (each will increment the shared counter)
        new Student("Management");
        System.out.println("Total students: " + Student.getTotalStudents());

        new Student("Programming");
        System.out.println("Total students: " + Student.getTotalStudents());

        new Student("Psychology");
        System.out.println("Total students: " + Student.getTotalStudents());

        // Bad practice: calling static method through an instance
        Student s = new Student("Math");
        System.out.println("Called via object (discouraged): " + s.getTotalStudents());

        // Checking the static constant
        System.out.println("Max students allowed: " + Student.MAX_STUDENTS);
    }
}
