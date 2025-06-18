package study.oop;

class TestClass {
    private String name;
    private int number;

    public TestClass(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public TestClass() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

public class J111Encapsulation {
    public static void main(String[] args) {
        TestClass test = new TestClass();
        test.setName("Adam");
        System.out.println(test.getName());
    }
}
