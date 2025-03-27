package study;

public class J13SpecialTypeVar {

    public static void main(String[] args){
        System.out.println(add(4, "6"));
    }

    public static int add(int a, String b){
        var result = a + Integer.valueOf(b).intValue();
        return  result;
    }
}
