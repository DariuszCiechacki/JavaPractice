package study.operators;

public class J28IncrementDecrement {
    public static void main(String[] args){
        //increment
        int num1 = 10;
        num1++;
        System.out.println(num1); // 11

        //decrement
        int num2 = 20;
        num2--;
        System.out.println(num2); // 19


        int b = 5;
        int c = 10 + b++; //inkrementacja przyrostkowa
        System.out.println(c); // 15
        System.out.println(b); // 6

        int d = 5;
        int e = 10 + ++d; //inkrementacja przedrostkowa
        System.out.println(d); // 6
        System.out.println(e); // 16
    }
}
