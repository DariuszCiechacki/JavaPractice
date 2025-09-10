package course.conditionalinstructions;

public class J39IfElse {
    public static void main(String[] args) {
        int a = 10 + 5;

        if (a == 14) {
            System.out.println("a nie jest równe 14");
        } else if (a < 15) {
            System.out.println("a nie jest mniejsze od 15");
        } else {
            System.out.println("a wynosi: " + a);
        }
    }
}
