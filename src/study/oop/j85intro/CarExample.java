package study.oop.j85intro;

/**
 * Obiekt na podstawie klasy Car
 */
public class CarExample {

    public static void main(String[] args) {
        // Tworzę nowy obiekt Ford
        Car ford = new Car(); //nowa instancja klasy Car
        ford.manufacturer = "Ford";
        ford.name = "Mustang";
        ford.color = "blue";
        ford.year = 1967;
        ford.topSpeed = 200.0f;
        ford.printInfo();

        //Tworzę nowy obiekt Chevrolet
        Car chevrolet = new Car(); //nowa instancja klasy Car
        chevrolet.manufacturer = "Chevrolet";
        chevrolet.name = "Camaro";
        chevrolet.color = "red";
        chevrolet.year = 2020;
        chevrolet.topSpeed = 300.0f;
        chevrolet.printInfo();
    }
}
