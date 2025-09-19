package practiceandnotes;

/**
 * ================= GETTERS AND SETTERS BASICS =================
 * Getters and setters provide controlled access to private fields.
 * - Getter: returns the value of a private field.
 * - Setter: updates the value of a private field.
 * Benefits:
 * - Encapsulation (hide implementation details).
 * - Validation (add logic before setting value).
 * - Read-only or write-only fields (omit setter/getter if needed).
 */
class GetterAndSetterClassic {
    // Private fields
    private String fullName;
    private int age;

    // Getter for name
    public String getFullName() {
        return fullName;
    }

    // Setter for name
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age with validation
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative");
        }
    }
}

public class GettersAndSettersDemo {
    public static void main(String[] args) {
        GetterAndSetterClassic getterSetter = new GetterAndSetterClassic();
        // Setting values
        getterSetter.setFullName("Michał Michalski");
        getterSetter.setAge(20);

        // Validation in setter
        getterSetter.setAge(-1);

        // Getting values
        System.out.println(getterSetter.getFullName() + " " + getterSetter.getAge());
    }
}
