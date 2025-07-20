package study.date;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class J139LocalDateTime {
    public static void main(String[] args) {
        // Date and time without timezone
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now); // 2025-07-20T17:50:38.875101500

        // format date and time
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy h:mm a");
        System.out.println(now.format(dateTimeFormatter));

        // Full date, time, and timezone
        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("Europe/Warsaw"));
        System.out.println(zdt); // 2025-07-20T17:51:22.096274900+02:00[Europe/Warsaw]

        String nowString = now.toString();
        System.out.println(nowString);
    }
}
