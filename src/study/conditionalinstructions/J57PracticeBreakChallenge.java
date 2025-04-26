package study.conditionalinstructions;

public class J57PracticeBreakChallenge {
    public static void main(String[] args) {

        int i = 0;

        do {
            System.out.println("Licznik pętli to: " + i);
            if (i == 10) {
                break;
            }
            i++;
        }
        while (i <= 50);
    }
}
