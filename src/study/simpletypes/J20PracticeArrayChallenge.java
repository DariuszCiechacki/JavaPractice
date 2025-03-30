package study.simpletypes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J20PracticeArrayChallenge {
    public static void main(String[] args) throws IOException {
        String names[] = {"Ania", "Ola", "Daniel", "Karol", "Kasia"};

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Podaj numer indeksu (maksymalna wartość to " + (names.length-1) + "): ");
        String givenIndex = reader.readLine();
        int formattedIndex = Integer.parseInt(givenIndex);
        System.out.println("Wartość indeksu to: " + names[formattedIndex]);
    }
}
