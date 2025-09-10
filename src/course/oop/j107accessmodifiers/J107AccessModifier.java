package course.oop.j107accessmodifiers;

import course.oop.j107accessmodifiers.differentpackage.J107DifferentPackageClass;

/**
 * protected: ten sam pakiet + klasy dziedziczące
 * private: tylko w tej samej klasie
 * Enkapsulacja: Modyfikatory dostępu obsługują enkapsulację, ukrywając szczegóły implementacji i ujawniając tylko to, co jest konieczne.
 * Zasada projektowania: Należy domyślnie używać najbardziej restrykcyjnego modyfikatora i otwierać dostęp tylko wtedy, gdy jest to wymagane.
 */

class ProtectedModifierInInheritingClass extends J107DifferentPackageClass {
    public void main(String[] args) {
        System.out.println(this.protectedClassField); //protected: klasa dziedzicząca
    }
}

public class J107AccessModifier {
    public static void main(String[] args) {
        J107SamePackageClass samePackageClass = new J107SamePackageClass();
        System.out.println(samePackageClass.publicClassField); // public: dowolna klasa (ten sam lub inny pakiet)
        System.out.println(samePackageClass.defaultClassField); // (domyślny) package-private: tylko w tym samym pakiecie
        System.out.println(samePackageClass.protectedClassField); // protected: ten sam pakiet
        //System.out.println(samePackageClass.privateClassField); // private: tylko w tej samej klasie

        J107DifferentPackageClass differentPackageClass = new J107DifferentPackageClass();
        System.out.println(differentPackageClass.publicClassField); // public: dowolna klasa (ten sam lub inny pakiet)
        //System.out.println(differentPackageClass.defaultClassField); // (domyślny) package-private: tylko w tym samym pakiecie
        //System.out.println(differentPackageClass.protectedClassField); // protected: ten sam pakiet
        //System.out.println(differentPackageClass.privateClassField); // private: tylko w tej samej klasie
    }
}
