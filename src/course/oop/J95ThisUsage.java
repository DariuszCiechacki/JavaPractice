package course.oop;

class Radio {
    int yearProduction;
    int volume;
    String station;

    Radio() {
        this.yearProduction = 2000;
        volume = 100;
    }

    Radio(int yearProduction) {
        this(); //Wywołanie konstruktora bezparametrowego
        this.yearProduction = yearProduction; //this.yearProduction odwołuje się do parametru klasy, yearProduction do zmiennej
        //this - jest parametrem niejawnym
        //yearProduction - jest parametrem jawnym metody
        this.changeStations("Rock");
    }

    public void changeStations(String newStation) {
        this.station = newStation;
    }

    public Radio getRadio() {
        return this;
    }

    public void printRadioInfo(Radio radio) {
        System.out.println("Radio producation year: " + radio.yearProduction);
    }
}

public class J95ThisUsage {
    public static void main(String args[]) {
        Radio oldRadio = new Radio(1996);
        Radio newRadio = new Radio(2010);

        newRadio.printRadioInfo(oldRadio.getRadio());
    }
}
