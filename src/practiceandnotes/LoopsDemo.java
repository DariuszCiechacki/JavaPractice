package practiceandnotes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * ================= LOOPS BASICS =================
 * Loops let you repeat a block of code multiple times until a condition is met.
 * Java supports several types of loops:
 * 1. for loop
 * - Works with anything that has an index or fixed size.
 * - Syntax: for (initialization; condition; update) { // code to be executed }
 * - Useful when you need index-based access.
 * 2. while loop
 * - Works with any collection or data structure where you can define a condition.
 * - Syntax: while (condition) { // code to be executed }
 * - Useful when the number of iterations is not known beforehand.
 * 3. do-while loop
 * - Same as while, but ensures at least one execution.
 * - Syntax: do { // code to be executed } while (condition);
 * - Useful when you need to execute the loop body at least once.
 * 4. enhanced for loop (for-each loop)
 * - Works with anything that implements Iterable.
 * - Syntax: for (Type item : collection) { // code to be executed }
 * - Useful for iterating over collections without needing an index.
 */

class Loops {
    // ====== ARRAY ======
    String[] fruits = {"Apple", "Banana", "Cherry"};
    // ====== LIST ======
    List<String> names = new ArrayList<>(List.of("Alice", "Bob", "Charlie"));
    // ====== SET ======
    Set<Integer> numbers = new HashSet<>(Set.of(10, 20, 30));
    // ====== MAP ======
    Map<String, Integer> ages = new HashMap<>();
}

public class LoopsDemo {
    public static void main(String[] args) {
        forLoopPractice();
    }

    private static void forLoopPractice() {
        CollectionExamples collectionExamples = new CollectionExamples();
        List<String> names = collectionExamples.getNamesList();
        for (int i = 0; i < names.size(); i++) {
            System.out.println("For loop list: " + names.get(i));
        }

        String[] fruits = collectionExamples.getFruitsArray();
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("For loop array: " + fruits[i]);
        }
    }
}
