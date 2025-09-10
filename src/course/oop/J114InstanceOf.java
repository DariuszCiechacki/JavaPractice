package course.oop;

/**
 * Operator instanceOf w Javie służy do sprawdzania,
 * czy obiekt jest instancją określonej klasy lub podklasy,
 * czy też implementuje określony interfejs.
 */

class Animals {
    protected String name;
    protected float weight;
    protected int numLegs;
}

class Dogs extends Animals {
    protected void bark() {
        System.out.println("Hau hau!");
    }
}

class Birds extends Animals {
    protected void fly() {
        System.out.println("Bird flies");
    }
}

class Parrots extends Birds {
    protected void learnWorld() {
        System.out.println("Learned word");
    }
}

public class J114InstanceOf {
    public static void main(String[] args) {
        Animals animals = new Animals();
        Dogs dogs = new Dogs();
        Birds birds = new Birds();

        System.out.println(dogs instanceof Animals); // true
        System.out.println(birds instanceof Animals); // true
        System.out.println(animals instanceof Dogs); // false
        System.out.println(animals instanceof Birds); // false
        System.out.println(dogs instanceof Dogs); // true
        System.out.println(birds instanceof Birds); // true

        Parrots parrots = new Parrots();
        System.out.println(parrots instanceof Parrots); // true
        System.out.println(parrots instanceof Birds); // true
        System.out.println(parrots instanceof Animals); // true
        System.out.println(animals instanceof Parrots); // false

        //System.out.println(dogs instanceof Birds); // błąd kompilacji: Inconvertible types; cannot cast 'study.oop.Dogs' to 'study.oop.Birds
    }
}
