package study.conditionalinstructions;

public class J62PracticeForEachLoopChallenge {
    public static void main(String[] args) {

        int[] numbers = {0, 1, 2, 3, 4, 5};
        int result = 0;

        for (int number : numbers) {
            result += number;
        }

        System.out.println(result);
    }
}
