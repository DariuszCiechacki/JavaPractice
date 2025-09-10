package course.oop;

abstract class MicrosoftEmployee {
    protected String name;
    protected String surname;

    public MicrosoftEmployee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public abstract String toString();
}

class MicrosoftProgrammer extends MicrosoftEmployee {
    protected String languages;

    public MicrosoftProgrammer(String name, String surname, String languages) {
        super(name, surname);
        this.languages = languages;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    @Override
    public String toString() {
        return "MicrosoftProgrammer{"
                + "languages='" + languages + '\''
                + ", name='" + name + '\''
                + ", surname='" + surname + '\''
                + '}';
    }
}

public class J119AbstractClassesChallenge {
    public static void main(String[] args) {
        MicrosoftProgrammer programmer = new MicrosoftProgrammer("Dariusz", "Sanitariusz", "Java");
        System.out.println(programmer.toString());
    }
}
