package study.oop;

/**
 * Wzorzec Singleton to kreacyjny wzorzec projektowy, który zapewnia, że klasa
 * ma tylko jedną instancję i udostępnia globalny punkt dostępu do tej instancji.
 * Zastosowanie:
 * potrzebujesz dokładnie jednej instancji klasy.
 * potrzebujesz globalnego dostępu do wystąpienia (np. do konfiguracji, rejestrowania lub udostępniania zasobów).
 * chcesz kontrolować dostęp do udostępnianych zasobów.
 * Przykłady zastosowania:
 * połaczenie z bazą danych
 * WebDriver w automatach
 */
class Singleton {
    private static Singleton driver;

    private Singleton() {
    }

    public static Singleton getDriver() {
        // Sprawdzenie czy instancja już została powołana
        if (driver == null) {
            driver = new Singleton();
        }

        return driver;
    }
}

public class J100Singleton {
    public static void main(String arg[]) {
        Singleton driver = Singleton.getDriver();
        Singleton driver2 = Singleton.getDriver();
        // ta sama instancja
        System.out.println(driver == driver2);
    }
}
