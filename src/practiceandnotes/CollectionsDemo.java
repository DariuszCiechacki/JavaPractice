package practiceandnotes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 * ================= COLLECTIONS BASICS =================
 * Collections are data structures that can hold multiple values.
 * Java provides several built-in collection types:
 * 1. Array
 * - Fixed size, can hold elements of the same type.
 * - Example: String[] fruits = {"Apple", "Banana", "Cherry"};
 * 2. List
 * - Ordered collection, can hold duplicate elements.
 * - Example: List<String> names = new ArrayList<>(List.of("Alice", "Bob", "Charlie", "Alice"));
 * 3. Set
 * - Unordered collection, cannot hold duplicate elements.
 * - Example: Set<Integer> numbers = new HashSet<>(Set.of(10, 20, 30));
 * 4. Map
 * - Key-value pairs, keys must be unique.
 * - Example: Map<String, Integer> ages = new HashMap<>();
 * 5. Queue
 * - FIFO (First In First Out) collection.
 * - Example: Queue<String> tasks = new LinkedList<>();
 */

class CollectionExamples {
    // ====== ARRAY ======
    private final String[] fruits = {"Apple", "Banana", "Cherry"};
    // ====== LIST ======
    private final List<String> names = new ArrayList<>(List.of("Alice", "Bob", "Charlie"));
    // ====== SET ======
    private final Set<Integer> numbers = new HashSet<>(Set.of(10, 20, 30));
    // ====== MAP ======
    private final Map<String, Integer> ages = new HashMap<>();
    // ====== QUEUE ======
    private final Queue<String> tasks = new LinkedList<>();

    public String[] getFruitsArray() {
        return fruits;
    }

    public List<String> getNamesList() {
        return names;
    }

    public Set<Integer> getNumbersSet() {
        return numbers;
    }

    public Map<String, Integer> getAgesMap() {
        return ages;
    }

    public Queue<String> getTasksQueue() {
        return tasks;
    }
}

public class CollectionsDemo {
    public static void main(String[] args) {
        listOperations();
        setOperations();
        mapOperations();
        queueOperations();
    }

    private static void listOperations() {
        CollectionExamples collections = new CollectionExamples();
        // List operations
        List<String> initialNamesList = collections.getNamesList();

        // Add element to list
        initialNamesList.add("David");
        List<String> updatedNamesList = collections.getNamesList();
        System.out.println("List: " + updatedNamesList);

        // Remove element from list
        initialNamesList.remove("Alice");
        List<String> afterRemovalNamesList = collections.getNamesList();
        System.out.println("List: " + afterRemovalNamesList);

        // Update element in list
        initialNamesList.set(0, "Eve");
        List<String> afterUpdateNamesList = collections.getNamesList();
        System.out.println("List: " + afterUpdateNamesList);

        // Access element by index
        String firstElement = initialNamesList.get(0);
        System.out.println("First element of list: " + firstElement);

        // Check if list contains an element
        boolean containsBob = initialNamesList.contains("Bob");
        System.out.println("List contains Bob: " + containsBob);
    }

    private static void setOperations() {
        CollectionExamples collections = new CollectionExamples();
        // Set operations
        Set<Integer> initialNumbersSet = collections.getNumbersSet();

        // Add element to set
        initialNumbersSet.add(40);
        Set<Integer> updatedNumbersSet = collections.getNumbersSet();
        System.out.println("Set: " + updatedNumbersSet);
        // Remove element from set
        initialNumbersSet.remove(20);
        Set<Integer> afterRemovalNumbersSet = collections.getNumbersSet();
        System.out.println("Set: " + afterRemovalNumbersSet);
    }

    private static void mapOperations() {
        CollectionExamples collections = new CollectionExamples();
        // Map operations
        Map<String, Integer> initialAgesMap = collections.getAgesMap();
        // Add key-value pair to map
        initialAgesMap.put("Alice", 30);
        initialAgesMap.put("Bob", 25);
        Map<String, Integer> updatedAgesMap = collections.getAgesMap();
        System.out.println("Map: " + updatedAgesMap);
        // Remove key-value pair from map
        initialAgesMap.remove("Alice");
        Map<String, Integer> afterRemovalAgesMap = collections.getAgesMap();
        System.out.println("Map: " + afterRemovalAgesMap);
        // Update value for a key in map
        initialAgesMap.put("Bob", 26);
        Map<String, Integer> afterUpdateAgesMap = collections.getAgesMap();
        System.out.println("Map: " + afterUpdateAgesMap);
        // Access value by key in map
        Integer bobsAge = initialAgesMap.get("Bob");
        System.out.println("Bob's age: " + bobsAge);
        // Check if map contains a key
        boolean containsAlice = initialAgesMap.containsKey("Alice");
        System.out.println("Map contains Alice: " + containsAlice);
    }

    private static void queueOperations() {
        CollectionExamples collections = new CollectionExamples();
        // Queue operations
        Queue<String> initialTasksQueue = collections.getTasksQueue();
        // Add element to queue
        initialTasksQueue.add("Task 1");
        Queue<String> updatedTasksQueue = collections.getTasksQueue();
        System.out.println("Queue: " + updatedTasksQueue);
        // Remove element from queue
        initialTasksQueue.poll();
        Queue<String> afterRemovalTasksQueue = collections.getTasksQueue();
        System.out.println("Queue: " + afterRemovalTasksQueue);
    }
}
