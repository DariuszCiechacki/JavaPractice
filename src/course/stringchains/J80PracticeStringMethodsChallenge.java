package course.stringchains;

public class J80PracticeStringMethodsChallenge {

    public static void main(String[] args) {
        String baseText = "Ola ma kota. ";

        String repeatedBaseText = baseText.repeat(3);
        System.out.println(repeatedBaseText);

        String changeAllNames = repeatedBaseText.replace("Ola", "Kasia");
        System.out.println(changeAllNames);

        String changeFirstName = changeAllNames.replaceFirst("Kasia", "Monika");
        System.out.println(changeFirstName);

        int nameFirstIndex = changeFirstName.indexOf("Kasia");
        System.out.println(nameFirstIndex);

        int nameLastIndex = changeFirstName.lastIndexOf("Kasia");
        System.out.println(nameLastIndex);

        String textPart = changeFirstName.substring(nameFirstIndex);
        System.out.println(textPart);
    }
}
