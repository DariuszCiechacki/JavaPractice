package study.operators;

public class J29RelationalOperators {
    public static void main(String[] args){
        boolean b1 = 5 == 3; // false
        System.out.println(b1);

        boolean b2 = 7 == 7; // true
        System.out.println(b2);

        boolean b3 = 7 != 7; // false
        System.out.println(b3);
        boolean b4 = 7 != 5; // true
        System.out.println(b4);

        boolean b5 = 10 > 4; // true
        System.out.println(b5);
        boolean b6 = 10 < 8; // false
        System.out.println(b6);

        boolean b7 = 10 >= 4; // true
        System.out.println(b7);
        boolean b8 = 10 <= 8; // false
        System.out.println(b8);
    }
}
