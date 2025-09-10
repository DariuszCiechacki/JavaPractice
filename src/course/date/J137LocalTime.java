package course.date;

import java.time.LocalTime;

public class J137LocalTime {
    public static void main(String[] args) {
        // Time only (no date)
        LocalTime time = LocalTime.now();
        System.out.println(time); // 17:49:55.466501100

        int hour = time.getHour();
        System.out.println(hour);
        int minutes = time.getMinute();
        System.out.println(minutes);
        int seconds = time.getSecond();
        System.out.println(seconds);
        int nanoseconds = time.getNano();
        System.out.println(nanoseconds);

        // add hours
        LocalTime addHours = time.plusHours(2);
        System.out.println(addHours);

        // add seconds
        LocalTime addSeconds = time.plusSeconds(5);
        System.out.println(addSeconds);
    }
}
