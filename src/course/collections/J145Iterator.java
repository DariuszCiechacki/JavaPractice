package course.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class J145Iterator {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Tom", "Anna", "John"));

        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            String name = it.next();
            System.out.println(name);
        }

        // SAFE removal
        names.removeIf(name -> name.startsWith("A"));
        System.out.println(names); // [Tom, John]
    }
}
