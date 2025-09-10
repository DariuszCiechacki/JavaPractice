package course.oop;

// klasa bazowa
class Animal {
    public int numberOfLegs = 99;

    // Constructor klasy bazowej
    Animal(String species) {
        System.out.println(species);
    }
}

// klasa dziedzicząca
class Dog extends Animal {
    public String dogName = "Unknown";
    public int numberOfLegs = 4;

    /**
     * słowo kluczowe "super" - dostęp do nadrzędnych właściwości klasy bazowej w klasie dziedziczącej
     */
    Dog(String dogName) {
        super("Dog"); // musi być pierwszym poleceniem w treści konstruktora
        System.out.println(super.numberOfLegs); // odwołanie się do zmiennej w klasie bazowej
        System.out.println(this.numberOfLegs); // odwołanie się do zmiennej w tej klasie
        this.dogName = dogName;
        System.out.println(dogName);
    }

    Dog() {
        super("Dog");
        System.out.println(this.dogName);
    }
}

public class J113SuperWord {
    public static void main(String[] args) {
        Dog myDog = new Dog("Mira");
        System.out.println(myDog.numberOfLegs);

        Dog unknownDog = new Dog();
    }
}
