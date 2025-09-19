package practiceandnotes;

import java.util.function.Function;

/**
 * ================= LAMBDA BASICS =================
 * A lambda expression is basically an anonymous function (a function without a name) that you can treat as an object.
 * It helps write concise code, especially when working with functional interfaces.
 * A functional interface is an interface with exactly one abstract method.
 * Examples from Java standard library:
 * - Runnable → void run()
 * - Callable<T> → T call()
 * - Comparator<T> → int compare(T o1, T o2)
 * - Predicate<T> → boolean test(T t)
 * - Function<T,R> → R apply(T t)
 * Lambda syntax:
 * - (parameters) -> expression
 * - (parameters) -> { statements; }
 */

public class LambdaDemo {
    public static void main(String[] args) {
        functionExample();
    }

    private static void functionExample() {
        Function<String, Integer> lengthFunction = str -> str.length();
        int length = lengthFunction.apply("Lambda");
        System.out.println(length);

        Function<Integer, Integer> multiplyBy2 = x -> x * 2;
        Function<Integer, Integer> add10 = x -> x + 10;

        // andThen: (5 * 2) → +10
        System.out.println(multiplyBy2.andThen(add10).apply(5)); // 20

        // compose: (5 + 10) → *2
        System.out.println(multiplyBy2.compose(add10).apply(5)); // 30
    }
}
