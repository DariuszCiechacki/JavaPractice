package course.oop;

class Wallet {
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

public class J90MethodsChallenge {
    public static void main(String[] args) {
        Wallet myWallet = new Wallet();

        for (int i = 1; i <= 6; i++) {
            myWallet.addMoney(5000.0f);
            myWallet.removeMoney(2000.0f);
            myWallet.removeMoney(1000.0f);
        }

        myWallet.printAmount();
    }
}
