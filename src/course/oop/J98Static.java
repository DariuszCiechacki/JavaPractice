package course.oop;

class Plane {
    /**
     * "static" oznacza, że zmienna należy do klasy, a nie do konkretnego obiektu.
     * Plane.nextId jest dzielone na wszystkie instancje klasy Plane.
     * Gdy jedna instancja zmienia nextId, wszystkie pozostałe instancje widzą zaktualizowaną wartość.
     */
    static int nextId = 1;
    int id;

    Plane() {
        this.id = nextId;
        nextId++;
    }

    /**
     * Nie może uzyskać bezpośredniego dostępu do zmiennych instancji lub metod instancji, ponieważ nie ma dostępu do "this".
     */
    public static int getNextId() {
        // this.id;
        return nextId++;
    }
}

public class J98Static {
    public static void main(String args[]) {
        Plane plane1 = new Plane();
        Plane plane2 = new Plane();
        Plane plane3 = new Plane();
        System.out.println("Plane1 id: " + plane1.id);
        System.out.println("Plane2 id: " + plane2.id);
        System.out.println("Plane3 id: " + plane3.id);

        System.out.println("Plane1 id: " + Plane.getNextId());
        System.out.println("Plane2 id: " + plane2.getNextId()); //Wywoływanie statycznych metod na obiekcie jest złą praktyką
        System.out.println("Plane3 id: " + Plane.getNextId());

    }
}
