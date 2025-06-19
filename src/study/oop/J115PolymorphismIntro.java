package study.oop;

/**
 * Polimorfizm oznacza „wiele form”. Pozwala na traktowanie obiektów jako instancji ich klasy nadrzędnej, a nie ich rzeczywistej klasy.
 * Umożliwia to pojedynczemu interfejsowi reprezentowanie różnych form bazowych (typów danych).
 * Istnieją dwa główne typy w Javie:
 * Czas kompilacji (statyczny): uzyskiwany przez przeciążenie metody
 * Czas wykonania (dynamiczny): uzyskiwany przez nadpisywanie metod
 */

// Statyczny: wiele metod w tej samej klasie ma tę samą nazwę, ale różne listy parametrów (typ, liczbę lub kolejność).
class StaticPolymorphism {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public float add(float a, float b) {
        return a + b;
    }
}

// Dynamiczny: podklasa dostarcza określoną implementację metody już zdefiniowanej w jej superklasie.
// JVM decyduje w czasie wykonywania, którą metodę wywołać na podstawie obiektu.
class DynamicPolymorphism {
    public int calculateSpeed(int a, int b) {
        return a + b;
    }
}

class Audi extends DynamicPolymorphism {
    @Override
    public int calculateSpeed(int a, int b) {
        return a * b;
    }
}

public class J115PolymorphismIntro {
    public static void main(String[] args) {
        StaticPolymorphism staticPolymorphism = new StaticPolymorphism();
        System.out.println(staticPolymorphism.add(15, 15));

        DynamicPolymorphism dynamicPolymorphism = new DynamicPolymorphism();
        System.out.println(dynamicPolymorphism.calculateSpeed(3, 3)); // 6

        DynamicPolymorphism audi = new Audi();
        System.out.println(audi.calculateSpeed(3, 3)); // Wynik: 9 - Wiązanie dynamiczne
    }
}
