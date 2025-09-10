package course.stringchains;

public class J67PracticeStringChainingChallenge {

    public static void main(String[] args) {
        String[] names = {"Darek", "Marek", "Arek", "Jarek"};
        String allNames = "";

        for (String name : names) {
            allNames = allNames.concat(name);
            allNames += " ";
        }

        System.out.println(allNames);
    }
}
