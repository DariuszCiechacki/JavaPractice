package study.oop.j86challenge;

public class Tv {
    String producent;
    String model;
    int productionYear;
    float price;

    public void printBasicData() {
        System.out.println(this.producent + " " + this.model + " " + this.productionYear);
    }
}
