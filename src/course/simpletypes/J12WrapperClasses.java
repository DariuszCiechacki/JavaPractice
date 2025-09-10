package course.simpletypes;

public class J12WrapperClasses {

    public static void main(String[] args) {
        //Integer
        int number1 = 13;
        String intToString = Integer.toString(number1);
        System.out.println(intToString);

        String number3 = "15";
        Integer stringToInt = Integer.parseInt(number3);
        System.out.println(stringToInt);

        int higherNumber = Integer.max(3, 5);
        System.out.println(higherNumber);

        int sumResult = Integer.sum(2, 5);
        System.out.println(sumResult);

        //Float
        float number2 = 15.5f;
        String floatToString = Float.toString(number2);
        System.out.println(floatToString);

        float lowerNumber = Float.min(10.5f, 100.5f);
        System.out.println(lowerNumber);
    }
}
