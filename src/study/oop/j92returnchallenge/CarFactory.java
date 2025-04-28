package study.oop.j92returnchallenge;

public class CarFactory {

    public CarFactory() {

    }

    public Car buildCar() {
        String[] colors = {"red", "black", "white"};
        int randIndex = (int) Math.floor(Math.random() * colors.length);
        String randColor = colors[randIndex];

        return new Car("Ford", "Mustang", randColor);
    }
}
