package study.oop;

class Employee {

}

class Manager extends Employee {
    String responsibility;
}

class Director extends Manager {
    String department;
}

class VicePresident extends Manager {

}

final class ChiefExecutiveOffice extends VicePresident {
    String companyName;
}

/* Nie można rozszerzyć klasy final
class ChiefTechnicalOffice extends ChiefExecutiveOffice {}
*/

public class J104FinalClass {
    public static void main(String[] args) {

    }
}
