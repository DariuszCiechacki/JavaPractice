package practiceandnotes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * ================= LOMBOK BASICS =================
 * Lombok is a Java library that helps reduce boilerplate code in your classes.
 * It uses annotations that are processed at compile time to automatically generate commonly used methods like:
 * - getters,
 * - setters,
 * - equals,
 * - hashCode,
 * - toString,
 * - Data (includes: @Getter, @Setter, @ToString, @EqualsAndHashCode, @RequiredArgsConstructor)
 * - constructors, builders, and more.
 */

@Getter
@Setter
class Person {
    private String name;
    private int age;
}

@ToString
class PersonAddress {
    public String street;
    public int buildingNumber;
}

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
class Employer {
    private String companyName;
    @NonNull
    private long nip;

}

public class LombokDemo {
    public static void main(String[] args) {
        // Lombok setter and getter
        Person person = new Person();
        person.setName("Żelisław");
        person.setAge(15);
        System.out.println(person.getName() + " " + person.getName());

        // Lombok ToString
        PersonAddress personAddress = new PersonAddress();
        personAddress.street = "Morwowa";
        personAddress.buildingNumber = 30;
        System.out.println(personAddress);

        // Lombok constructor
        Employer employer1 = new Employer(); // no-args constructor
        Employer employer2 = new Employer("LeroyMerlin", 123123123); // all-args constructor
        Employer employer3 = new Employer(123123123); // required args (for @NonNull field "nip")
    }
}
