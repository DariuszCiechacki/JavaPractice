package course.oop;

/**
 * Metoda to kolekcja instrukcji razem zgrupowana, która może być wielokrotnie wywołana, aby przeprowadzić jakieś operacje.
 * Na przykładzie metody main - metoda składa się z poniższych elementów:
 * 1. public - modyfikator dostępu: public, private, protected
 * 2. static - modyfikator określa, że metoda może zostać wywołana bez tworzenia obiektu klasy
 * 3. void - metody mogą zwrócić wartość np. String, int lub inny typ. Jeśli nic nie zwracają - void
 * 4. main - nazwa metody
 * 5. String[] args - parametry podawane przy wywoływaniu metody. Metoda main przyjmuje jako parametr tablice łańcuchów znaków
 * 6. {} - ciało funkcji z instrukcjami do wykonania
 */
public class J89Methods {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    /**
     * Zmienne mogą być przekazywane do metody na dwa sposoby:
     * 1. poprzez wartość (call by value)
     * 2. poprzez referencje (call by reference)
     */

    // 1. poprzez wartość
    public static void valueParameter(int a, int b) {
        int result = a + b;
        System.out.println("Result is: " + result);
    }

    // 2. poprzez referencje
    public static void referenceParameter(Tv tv) {
        tv.printBasicData();
    }
}
