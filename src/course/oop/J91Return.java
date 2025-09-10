package course.oop;

class Circle {
    float radius;

    Circle(float r) {
        radius = r;
    }
}

class MathMethods {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public Circle getNewCircle(float radius) {
        Circle c = new Circle(radius);
        return c;
    }
}

public class J91Return {
    public static void main(String[] args) {
        MathMethods mathMethods = new MathMethods();

        int a = 12;
        int b = 3;
        int result = mathMethods.subtract(a, b);
        System.out.println(result);

        Circle circle = mathMethods.getNewCircle(10.0f);
        System.out.println("Radius: " + circle.radius);
    }
}
