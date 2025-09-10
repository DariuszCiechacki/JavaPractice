package course.oop;

class Tv {
    String producent;
    String model;
    int productionYear;
    float price;

    public void printBasicData() {
        System.out.println(this.producent + " " + this.model + " " + this.productionYear);
    }
}

public class J86IntroChallenge {
    public static void main(String[] args) {
        Tv phillips = new Tv();
        phillips.producent = "Phillips";
        phillips.productionYear = 2020;
        phillips.model = "Ambilight X5";
        phillips.price = 2499.0f;
        phillips.printBasicData();
    }
}
