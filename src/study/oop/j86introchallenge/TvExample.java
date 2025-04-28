package study.oop.j86introchallenge;

public class TvExample {
    public static void main(String[] args) {
        Tv phillips = new Tv();
        phillips.producent = "Phillips";
        phillips.productionYear = 2020;
        phillips.model = "Ambilight X5";
        phillips.price = 2499.0f;
        phillips.printBasicData();
    }
}
