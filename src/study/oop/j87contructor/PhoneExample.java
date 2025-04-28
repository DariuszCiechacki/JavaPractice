package study.oop.j87contructor;

public class PhoneExample {

    public static void main(String[] args) {
        Phone iPhone = new Phone("Apple", "16e", "blue", 2025, 2499.0f);
        iPhone.printInfo();

        Phone xiaomi = new Phone();
        xiaomi.printInfo();
    }
}
