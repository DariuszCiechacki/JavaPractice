package study.conditionalinstructions;

public class J48PracticeForLoopChallenge {
    public static void main(String[] args) {
        /*String[] names = {"Ania", "Kasia", "Ola", "Olek", "Daniel"};

        for (int a = 0; a < names.length; a++) {
            System.out.println(names[a]);
        }

        for (int b = names.length - 1; b >= 0; b--) {
            System.out.println(names[b]);
        }*/

        /*int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println(sum);*/

        /*String[] englishNames = {"John", "Elizabeth", "Tom", "Catherine", "Max"};
        int longNames = 0;
        for (int i = 0; i < englishNames.length; i++) {
            if (englishNames[i].length() > 5) {
                longNames++;
            }
        }
        System.out.println("Number of names with more than 5 characters: " + longNames);*/

        String[] words = {"Sun", "Planet", "Galaxy", "Universe"};
        String longestWord = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }
        System.out.println(longestWord);
    }
}
