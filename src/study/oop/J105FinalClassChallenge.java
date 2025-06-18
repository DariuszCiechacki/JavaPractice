package study.oop;

//Dodanie słowa "final" powoduje błąd w kompilacji: java: cannot inherit from final study.oop.GoogleEmployee
class GoogleEmployee {
    String name;
    String surname;

    GoogleEmployee() {
    }

    GoogleEmployee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void printInfo() {
        System.out.println("Name: " + this.name + "\n" + "Surname: " + this.surname);
    }
}

class GoogleAdministrator extends GoogleEmployee {
    String certificate;

    GoogleAdministrator(String name, String surname, String certificate) {
        this.name = name;
        this.surname = surname;
        this.certificate = certificate;
    }

    public void printInfo() {
        System.out.println("Name: " + this.name + "\n" + "Surname: " + this.surname + "\n" + "Certificate: " + this.certificate);
    }
}

class GoogleProgrammer extends GoogleEmployee {
    String lanugages;

    GoogleProgrammer(String name, String surname, String lanugages) {
        this.name = name;
        this.surname = surname;
        this.lanugages = lanugages;
    }

    public void printInfo() {
        System.out.println("Name: " + this.name + "\n" + "Surname: " + this.surname + "\n" + "Languages: " + this.lanugages);
    }
}

public class J105FinalClassChallenge {
    public static void main(String[] args) {
        GoogleEmployee googleEmployee = new GoogleEmployee("Ramadan", "Dwali");
        googleEmployee.printInfo();
        GoogleAdministrator googleAdministrator = new GoogleAdministrator("Rajesh", "Kootraphali", "GCP developer");
        googleAdministrator.printInfo();
        GoogleProgrammer googleProgrammer = new GoogleProgrammer("Maghdi", "Magdadi", "Java, PHP");
        googleProgrammer.printInfo();
    }
}
