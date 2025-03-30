package study.simpletypes;

public class J19OneDimensionalArray {
    public static void main(String[] args){
        int numArray[];
        numArray = new int[5];
        numArray[2] = 7;

        System.out.println("Długość tablicy to: " + numArray.length);
        System.out.println("Wartość 3-ego elementu to: " + numArray[2]);

        String textArray[] = {"Kasia", "Basia", "Stasia"};
        System.out.println(textArray[0]);
        textArray[0] = "Wanda";
        System.out.println("Nadpisana wartość - była Kasia, a jest " + textArray[0]);
    }
}
