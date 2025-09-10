package course.date;

import java.util.Date;

public class J132FormatDataPrintf {

    public static void main(String[] args) {
        // %s - String
        String hello = "Hello World ";
        System.out.printf("%s", hello);

        // %d Integer (decimal)
        int number = 666;
        System.out.printf("%d", number);

        // %f Floating point
        float floatNumber = 0.666f;
        System.out.printf("%f", floatNumber);

        // %c Character
        char singleChar = 'X';
        System.out.printf("%c", singleChar);

        // %b Boolean
        boolean testBoolean = false;
        System.out.printf("%b", testBoolean);

        // %n Newline (platform independent)
        System.out.printf("%n", "/b");

        System.out.printf("Hello %s %d%f %b %n %tc", "World", 6, 6.6f, true, new Date());
    }
}
