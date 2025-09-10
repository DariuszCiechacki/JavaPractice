package course.bignumbers;

import java.math.BigDecimal;
import java.math.BigInteger;

public class J24BigIntegerDecimal {
    public static void main(String[] args) {
        BigInteger bigInt = new BigInteger("531253215312531532");
        bigInt = bigInt.add(new BigInteger("5423527643453232"));
        System.out.println("Wynik to: " + bigInt);

        BigDecimal bigDec = new BigDecimal("53253142142.421421");
        bigDec = bigDec.pow(3);
        System.out.println("Wynik to: " + bigDec);
    }
}
