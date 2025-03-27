package study;

public class J15PracticeDepositChallenge {

    public static void main(String[] args){
        float deposit = 1000.00f;
        float numDays = 180;
        float interestRate = 0.06f;
        final float daysInYear = 365;
        float tax = 0.19f;

        float interest = deposit * numDays * interestRate / daysInYear;
        System.out.println("Przychód z lokaty: " + interest);

        float taxValue = tax * interest;
        System.out.println("Podatek: " + taxValue);

        float revenueAfterTax = interest - taxValue;
        System.out.println("Zysk po opodatkowaniu: " + revenueAfterTax);
    }
}
