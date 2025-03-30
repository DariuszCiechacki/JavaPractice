package study;

import java.math.BigDecimal;
import java.math.BigInteger;

public class J25NumbersConversion {
    public static void main(String[] args){

        //Konwersja jawna - zawężająca
        int i = 5;
        double d = 20.0d;
        double result = d/(double) i;
        System.out.println(result);

        //Konwersja niejawna - rozszerzająca
        int i2 = 4;
        double d2 = 10.0d;
        double result2 = d2*i2;
        System.out.println(result2);
    }
}
