package course.oop;

class Student {
    String firstName;
    String lastName;
    String city;
    int age;

    public Student() {
        this.firstName = "Jan";
        this.lastName = "Kowalski";
        this.city = "Warszawa";
        this.age = 19;
    }

    public Student(String firstName, String lastName, String city, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.age = age;
    }

    public void printInfo() {
        System.out.println(this.firstName + " " + this.lastName + " " + this.city + " " + this.age);
    }
}

public class J88ConstructorChallenge {
    public static void main(String[] args) {
        Student defaultStudent = new Student();
        defaultStudent.printInfo();

        Student newStudent = new Student("Dariusz", "Ciechacki", "Wrocław", 32);
        newStudent.printInfo();
    }
}
