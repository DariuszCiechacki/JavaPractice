package study.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class J142DateTimeChallenge {
    public static void main(String[] args) {
        LocalDateTime nowDateTime = LocalDateTime.now();
        LocalDate futureDate = LocalDate.of(2040, 9, 15);
        LocalTime time = LocalTime.of(13, 45);
        LocalDateTime futureDateTime = LocalDateTime.of(futureDate, time);

        if (futureDateTime.isAfter(nowDateTime)) {
            System.out.println("Data jest z przyszłości");
        }
    }
}
