package study.conditionalinstructions;

public class J47PracticeSwitchChallenge {
    public static void main(String[] args) {
        int monthNumber = 9;
        String season;

        switch (monthNumber) {
            case 3:
            case 4:
            case 5:
                season = "Wiosna";
                break;
            case 6:
            case 7:
            case 8:
                season = "Lato";
                break;
            case 9:
            case 10:
            case 11:
                season = "Jesień";
                break;
            case 12:
            case 1:
            case 2:
                season = "Zima";
                break;
            default:
                season = "Brak informacji!";
        }
        System.out.println("Numer miesiąca to pora roku: " + season);
    }
}
