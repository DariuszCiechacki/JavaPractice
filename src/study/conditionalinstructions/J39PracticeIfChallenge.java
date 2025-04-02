package study.conditionalinstructions;

import java.io.IOException;

public class J39PracticeIfChallenge {
    public static void main(String[] args) throws IOException {
        /*// Task 1
        int a = 341;

        if (a > 0) {
            System.out.println("Liczba a jest większa od 0");
        } else if (a < 0) {
            System.out.println("Liczba a jest mniejsza od 0");
        } else if (a == 0) {
            System.out.println("Liczba a jest równa 0");
        } else {
            System.out.println("Liczba a wynosi: " + a);
        }*/

        /*// Task 2
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj wiek");
        String givenAge = reader.readLine();
        System.out.println("Podaj wagę");
        String givenWeight = reader.readLine();

        int age = Integer.parseInt(givenAge);
        int weight = Integer.parseInt(givenWeight);

        if (age >= 18) {
            if (weight >= 50) {
                System.out.println("Kwalifikacja do oddania krwi");
            } else {
                System.out.println("Kryterium wagi nie spełnione");
            }
        } else {
            System.out.println("Wymóg wieku nie jest spełniony");
        }*/

        /*// Task 3
        boolean raining = false;
        boolean haveUmbrella = false;
        int temperature = 4;

        if (temperature > 40 || temperature < -20) {
            System.out.println("Zostań w domu");
        } else if (temperature > -10 && temperature < 10 && raining && haveUmbrella) {
            System.out.println("Możesz wyjść z domu");
        } else if (raining == false && temperature > 12) {
            System.out.println("Możesz wyjść z domu");
        } else {
            System.out.println("Zostań w domu");
        }*/

        // Task 4
        int points = 0;
        boolean driverLicense = true;
        int experienceYears = 12;
        boolean drunkDriving = false;
        boolean causedAccident = false;
        boolean overSpeeding = true;

        if (driverLicense) {
            int hasDriverLicensePoints = 20;
            points += hasDriverLicensePoints;
            System.out.println("Punkty przyznane za posiadanie prawa jazdy: " + hasDriverLicensePoints);

            if (drunkDriving || causedAccident) {
                int penaltyPoints = 100;
                points -= 100;
                System.out.println("Punkty odjęte za wypadek lub DUI: " + penaltyPoints);
            }

            if (overSpeeding) {
                int penaltyPointsOverSpeeding = 10;
                points -= penaltyPointsOverSpeeding;
                System.out.println("Punkty odjęte za przekraczanie prędkości: " + penaltyPointsOverSpeeding);
            }

            int experienceYearsPoints = 20;
            if (experienceYears >= 10) {
                points += experienceYearsPoints;
                System.out.println("Punkty dodane za doświadczenie: " + experienceYearsPoints);
            } else if (experienceYears > 60) {
                points -= experienceYearsPoints;
                System.out.println("Punkty odjęte za doświadczenie: " + experienceYearsPoints);
            }

            System.out.println("Kierowca uzbierał punktów: " + points);

        } else if (!driverLicense) {
            System.out.println("Brak prawa jazdy!");
        }
    }
}
