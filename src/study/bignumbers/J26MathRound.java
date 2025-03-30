package study.bignumbers;

public class J26MathRound {
    public static void main(String[] args){
        //zaokrąglenie do najbliższej liczby całkowitej
        System.out.println(Math.round(5.51)); // 6
        System.out.println(Math.round(5.49)); // 5

        //rzutowanie, utrata części ułamkowej
        System.out.println((int) 7.45d); // 7

        //Math.ceil - największa możliwa liczba całkowita
        System.out.println(Math.ceil(8.45)); // 9.0
        System.out.println(Math.ceil(8.8)); // 9.0

        //Math.floor - najmniejsza możliwa liczba całkowita
        System.out.println(Math.floor(8.45)); // 8.0
        System.out.println(Math.floor(8.8)); // 8.0
    }
}
