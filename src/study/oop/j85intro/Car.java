package study.oop.j85intro;

/**
 * Klasa Car (Szablon)
 */
class Car {
    String manufacturer;
    String name;
    int year;
    String color;
    float topSpeed;

    // Metoda/funkcja
    public void printInfo() {
        System.out.println(this.manufacturer + " " + this.name + " " + this.year);
    }
}
