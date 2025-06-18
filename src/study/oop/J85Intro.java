package study.oop;

/**
 * Klasa jest to szablon opisujący stan oraz zachowania danego obiektu.
 * Poniższa klasa "Car" opisuje samochód oraz jego właściwości jak producent, nazwę i prędkość maksymalną.
 */
class FastCar {
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

/**
 * Obiekt na podstawie klasy Car
 */
public class J85Intro {
    public static void main(String[] args) {
        // Tworzę nowy obiekt Ford
        FastCar ford = new FastCar(); //nowa instancja klasy Car
        ford.manufacturer = "Ford";
        ford.name = "Mustang";
        ford.color = "blue";
        ford.year = 1967;
        ford.topSpeed = 200.0f;
        ford.printInfo();

        //Tworzę nowy obiekt Chevrolet
        FastCar chevrolet = new FastCar(); //nowa instancja klasy Car
        chevrolet.manufacturer = "Chevrolet";
        chevrolet.name = "Camaro";
        chevrolet.color = "red";
        chevrolet.year = 2020;
        chevrolet.topSpeed = 300.0f;
        chevrolet.printInfo();
    }
}
