package course.oop;

import java.util.Arrays;

/**
 * Java uses exceptions to separate error-handling logic from regular logic, which:
 * Improves code readability and maintainability
 * Prevents silent failures
 * Allows centralized error handling
 */

class MyExceptions extends Exception {
    MyExceptions() {
    }

    public String toString() {
        return ("My exception occured!");
    }
}

// Throw: Used to actually throw an exception at runtime
// Throws: Declares that a method might throw an exception
class ValidationUtils {
    public void validateElementText(String actual, String expected) throws Exception {
        if (!actual.equals(expected)) {
            throw new Exception("Text does not match expected value!");
        }
    }
}

public class J125Exceptions {
    public static void main(String[] args) {

        int numArr[] = {0, 1, 2, 3, 4, 5};

        // try: Block of code to monitor for errors. A try block can be followed by multiple catch blocks
        try {
            int selectedNumber = numArr[8];
            // catch: Handles the exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Selected number is out of bond!");
        }

        int firstElement = Arrays.stream(numArr).findFirst().getAsInt();
        int lastElement = numArr.length;
        try {
            int result = lastElement / firstElement;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception. Divided number is: " + firstElement);
        }

        try {
            if (numArr.length < 10) {
                throw new MyExceptions();
            }
        } catch (MyExceptions exception) {
            exception.printStackTrace();
        }

        // finally: The finally block always runs, regardless of which (if any) catch block is triggered.
        // The finally block does not relate to a specific catch. It relates to the whole try block — it runs after try and any catch block
        finally {
            System.out.println("Program is continued");
        }
    }
}