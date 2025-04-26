package study.conditionalinstructions;

public class J52PracticeWhileLoopChallenge {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6};
        int i = 0;


        while (i < numbers.length) {
            System.out.println("Number: " + numbers[i]);
            System.out.println("Number multiplied by 2: " + numbers[i] * 2);
            i++;
        }
    }
}
