package study.oop;

class UnderageException extends Exception {
    UnderageException(String message) {
        System.out.println(message);
    }
}

public class J126ExceptionsChallenge {
    public static void main(String[] args) {

        int firstNumber = 10;
        int secondNumber = 0;

        try {
            int result = firstNumber / secondNumber;
            System.out.println("Result is: " + result);
        } catch (ArithmeticException exception) {
            exception.printStackTrace();
            System.out.println("Arithmetic exception occured!");
        }

        int givenAge = 15;
        int adultAge = 18;

        try {
            if (givenAge < adultAge) {
                throw new UnderageException("Little piece of shit is underage!");
            }
        } catch (UnderageException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("The finally block was ran");
        }
    }
}
