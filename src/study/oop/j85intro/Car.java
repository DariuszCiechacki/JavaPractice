package study.oop.j85intro;

/**
 * Klasa jest to szablon opisujący stan oraz zachowania danego obiektu.
 * Poniższa klasa "Car" opisuje samochód oraz jego właściwości jak producent, nazwę i prędkość maksymalną.
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
