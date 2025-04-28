package study.oop.j88constructorchallenge;

public class StudentExample {
    public static void main(String[] args) {
        Student defaultStudent = new Student();
        defaultStudent.printInfo();

        Student newStudent = new Student("Dariusz", "Ciechacki", "Wrocław", 32);
        newStudent.printInfo();
    }
}
