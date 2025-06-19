package study.oop;

abstract class FootballPlayer {
    protected String firstName;
    protected String lastName;
    protected String nationality;
    protected int age;

    protected FootballPlayer(String firstName, String lastName, String nationality, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
        this.age = age;
    }

    public FootballPlayer() {
    }

    // abstract void printInfo() {} // metody abstrakcyjne w klasie abstrakcyjnej nie mogą mieć ciała

    // klasa rozszerzająca klasę abstrakcyjną musi zaimplementować jej metody abstrakcyjne
    abstract void printInfo();

    protected void printPosition(String position) {
        System.out.println(position);
    }
}

class Defenders extends FootballPlayer {
    public Defenders(String firstName, String lastName, String nationality, int age) {
        super(firstName, lastName, nationality, age);
    }

    public Defenders() {
    }

    @Override
    void printInfo() {
        System.out.println(firstName + lastName + nationality + age);
    }
}

public class J118AbstractClasses {
    public static void main(String[] args) {
        Defenders defenders = new Defenders("Rio", "Ferdinand", "England", 25);
        defenders.printInfo();
        defenders.printPosition("Defender");

        // FootballPlayer footballPlayer = new FootballPlayer(); // nie można utworzyć instancji klasy abstrakcyjnej
        FootballPlayer defenders2 = new Defenders(); // można przypisać podklasę do zmiennej typu abstrakcyjnego

    }
}
