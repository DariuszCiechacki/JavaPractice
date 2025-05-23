package study.oop;

class PointWithConstants {
    final int width = 12;
    final int height;
    int x;
    int y;

    PointWithConstants() {
        this.height = 20;
    }

    PointWithConstants(int posX, int posY) {
        this();
        this.x = posX;
        this.y = posY;
    }

    public void changePosition(final int newX, final int newY) {
        // Nie można przypisać wartości do zmiennej newX, ponieważ jest oznaczona jako final:
        // newX = 100; //w parametrze metody changePosition
        //this.width = 100; // w zmiennej instancyjnej
        //this.height = 100; // w zmiennej instancyjnej, można przypisać wartość w konstruktorze
    }
}

public class J96FinalWord {

}
