package study.oop.j90methodschallenge;

public class WalletExample {

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
