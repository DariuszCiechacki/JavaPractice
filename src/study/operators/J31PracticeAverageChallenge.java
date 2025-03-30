package study.operators;

import java.util.Arrays;

public class J31PracticeAverageChallenge {
    public static void main(String[] args){
        int numbers[] = {1,2,3,4};

        int sum = Arrays.stream(numbers).sum();
        System.out.println("Suma liczb to: " + sum);

        float average = (float) sum /numbers.length;
        System.out.println("Średnia z liczb to: " + average);

        average++;
        System.out.println("Inkrementacja: " + average);

        average--;
        System.out.println("Dekrementacja: " + average);
    }
}
