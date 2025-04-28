package study.oop.j90methodschallenge;

public class Wallet {
    float money;

    public Wallet(float money) {
        this.money = money;
    }

    public Wallet() {
        this.money = 3000.0f;
    }

    public void addMoney(float amount) {
        this.money = this.money + amount;
    }

    public void removeMoney(float amount) {
        this.money = this.money - amount;
    }

    public void printAmount() {
        System.out.println("Aktualna wartość portfela: " + this.money);
    }
}
