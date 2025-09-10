package course.operators;

public class J35LogicOperatorOr {
    public static void main(String[] args) {

        // alternatywa
        boolean bl1 = 5 < 10 || 20 >= 15; // true OR true wynik true
        System.out.println(bl1);

        boolean bl2 = 5 > 10 || 20 > 15; // false OR true wynik true
        System.out.println(bl2);

        boolean bl3 = 5 < 10 || 20 < 15; // true OR false wynik true
        System.out.println(bl3);

        boolean bl4 = 5 > 10 || 20 < 15; // false OR false wynik false
        System.out.println(bl4);
    }
}
