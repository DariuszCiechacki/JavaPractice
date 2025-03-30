package study.bignumbers;

public class J26PracticeBmiChallenge {
    public static void main(String[] args){
        double weight = 83;
        float height = 1.72f;

        double bmi = weight/(Math.pow(height, 2));
        System.out.println("BMI to: " + (int) bmi);
    }
}
