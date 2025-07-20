package study.date;

import java.time.LocalDate;

public class J141CompareDates {
    public static void main(String[] args) {
        LocalDate dateNow = LocalDate.now();
        LocalDate dateToCompare = LocalDate.of(1993, 9, 20);

        boolean todayIsAfter = dateNow.isAfter(dateToCompare);
        System.out.println(todayIsAfter);

        boolean todayIsBefore = dateNow.isBefore(dateToCompare);
        System.out.println(todayIsBefore);

        boolean todayIsEqual = dateNow.isEqual(dateToCompare);
        System.out.println(todayIsEqual);
    }
}
