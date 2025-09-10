package course.collections;

import java.util.ArrayList;
import java.util.Collections;

/*
Key features of ArrayList:
1. Ordered (elements maintain insertion order)
2. Allows duplicates
3. Allows null elements
4. Not synchronized (i.e., not thread-safe)
5. Internally uses an Object[] array
 */

public class J143ArrayList {
    public static void main(String[] args) {
        basicActions();
        arraySorting();
    }

    private static void basicActions() {
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Strawberry");
        System.out.println(fruits); // [Apple, Banana, Strawberry]

        // Access by index
        System.out.println(fruits.get(0)); // Apple

        // Update array
        fruits.set(1, "Orange");
        System.out.println(fruits.get(1)); // Orange
        System.out.println(fruits); // [Apple, Orange, Strawberry]

        // Remove
        fruits.remove("Orange");
        System.out.println(fruits); // [Apple, Strawberry]

        // Check size
        System.out.println(fruits.size()); // 2

        // Check if list contains an element
        System.out.println(fruits.contains("Apple")); // true
        System.out.println(fruits.contains("Pineapple")); // false
    }

    private static void arraySorting() {
        // Sorting integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5421);
        numbers.add(2);
        numbers.add(123);
        numbers.add(55);
        Collections.sort(numbers);
        System.out.println(numbers); // [2, 55, 123, 5421]

        // Sorting strings
        ArrayList<String> names = new ArrayList<>();
        names.add("Kasia");
        names.add("Mariusz");
        names.add("Wincent");
        names.add("Karolina");
        Collections.sort(names);
        System.out.println(names); // [Karolina, Kasia, Mariusz, Wincent]

        // Sorting in reverse order
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println(numbers);  // [5421, 123, 55, 2]

        Collections.sort(names, Collections.reverseOrder());
        System.out.println(names); // [Wincent, Mariusz, Kasia, Karolina]
    }
}
