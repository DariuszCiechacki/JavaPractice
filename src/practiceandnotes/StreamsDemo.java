package practiceandnotes;

import java.util.List;

/**
 * ================= STREAMS BASICS =================
 * A Stream in Java is a sequence of elements that supports various operations to perform computations in a functional style.
 * Key points:
 * - Stream is not a data structure, it’s a view over a data source (like a List, Set, Map, or array).
 * - It does not store elements; it processes them.
 * - Stream operations are lazy → elements are not processed until a terminal operation is invoked.
 * - Once a stream is consumed, it cannot be reused.
 * Types of Operations
 * - Intermediate operations → return a new Stream (lazy).
 * - Examples: filter, map, sorted, distinct, limit, skip.
 * - Terminal operations → produce a result or side-effect.
 * - Examples: collect, forEach, reduce, count, findFirst.
 */
public class StreamsDemo {
    public static void main(String[] args) {
        List<String> names = new CollectionExamples().getNamesList();

        // filter → keep only names starting with A
        List<String> namesStartsWithA = names.stream().filter(n -> n.startsWith("A")).toList();
        System.out.println(namesStartsWithA);

        // map → transform each name to uppercase
        List<String> namesWithUpperCase = names.stream().map(String::toUpperCase).toList();
        System.out.println(namesWithUpperCase);

        
    }
}
