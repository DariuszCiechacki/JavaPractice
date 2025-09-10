package course.conditionalinstructions;

public class J44TernaryOperator {
    public static void main(String[] args) {
        int a = 14;

        if (a == 14) {
            System.out.println("a jest równe 14");
        } else {
            System.out.println("a nie jest równe 14");
        }

        String b = (a == 14) ? "a jest równe 14" : "a nie jest równe 14";
        System.out.println(b);
    }
}
