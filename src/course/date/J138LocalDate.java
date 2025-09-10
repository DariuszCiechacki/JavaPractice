package course.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class J138LocalDate {
    public static void main(String[] args) {
        // Date only (no time)
        LocalDate today = LocalDate.now();
        System.out.println(today); // 2025-07-20

        // My birthdate
        LocalDate myBirthDate = LocalDate.of(1993, 9, 20);
        System.out.println(myBirthDate); // 1993-09-20

        // change date format
        LocalDate dateNow = LocalDate.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(dateNow.format(dateFormatter));

        // add days
        LocalDate addDays = today.plusDays(2);
        System.out.println(addDays);

        int month = today.getMonthValue();
        System.out.println(month);
        int dayOfMonth = today.getDayOfMonth();
        System.out.println(dayOfMonth);
        int dayOfTheYear = today.getDayOfYear();
        System.out.println(dayOfTheYear);
        DayOfWeek dayOfTheWeek = today.getDayOfWeek();
        System.out.println(dayOfTheWeek);
    }
}
