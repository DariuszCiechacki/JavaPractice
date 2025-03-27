package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J17PracticeStringChallenge {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in)
        );

        System.out.println("Podaj swoje imię: ");
        String name = reader.readLine();
        System.out.println("Twoje imię to: " + name);

        System.out.println("Podaj swoje miejsce zamieszkania: ");
        String city = reader.readLine();
        String nameAndCity = name + " mieszka w  " + city;
        System.out.println(nameAndCity);
        int numberOfChars = nameAndCity.length();
        System.out.println("Liczba znaków to: " + numberOfChars);
    }
}
