package study.operators;

public class J33LogicOperatorAnd {
    public static void main(String[] args){

        // koniunkcja
        boolean bl1 = 5 < 10 && 20 >= 15; // true AND true wynik true
        System.out.println(bl1);

        boolean bl2 = 5 > 10 && 20 > 15; // false AND true wynik false
        System.out.println(bl2);

        boolean bl3 = 5 < 10 && 20 < 15; // true AND false wynik false
        System.out.println(bl3);

        boolean bl4 = 5 > 10 && 20 < 15; // false AND false wynik false
        System.out.println(bl4);
    }
}
