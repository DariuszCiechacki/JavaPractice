package study.simpletypes;

public class J16StringChains {
    public static void main(String[] args){
        String s1 = "Ola ma ";
        String s2 = new String("kota.");
        s1 = s1 + s2;
        System.out.println(s1);

        // \n - Nowy wiersz
        String s3 = "\nOla ma też psa. ";
        s1 = s1 + s3;
        System.out.println(s3);

        /*
        Pozostałe:
        \t - Tab
        \b - Backspace
        \r - Powrót karetki
        \' - Apostrof
        \" - Cudzysłów
        \\ - Backlash
        \u2202 - Dowolny znak unicode
         */
        String s4 = "\"Ola ma również zjebany łeb.\\";
        s4 = s3 + s4;
        System.out.println(s4.toUpperCase());
    }
}
