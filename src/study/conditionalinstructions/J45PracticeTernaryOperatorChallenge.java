package study.conditionalinstructions;

public class J45PracticeTernaryOperatorChallenge {
    public static void main(String[] args) {
        int number = 14;

        String info = (number % 2 == 0) ? "Liczba jest parzysta" : "Liczba jest nieparzysta";
        System.out.println(info);
    }
}
