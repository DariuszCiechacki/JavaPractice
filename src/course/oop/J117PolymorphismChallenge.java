package course.oop;

class Flat {
    protected String city;
    protected String street;

    public Flat() {
    }

    public Flat(String city, String street) {
        this.city = city;
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Flat{"
                + "city='" + city + '\''
                + ", street='" + street + '\''
                + '}';
    }
}

class House extends Flat {
    protected float parcelSize;

    public House(String city, String street, float parcelSize) {
        super(city, street);
        this.setParcelSize(parcelSize);
    }

    public float getParcelSize() {
        return parcelSize;
    }

    public void setParcelSize(float parcelSize) {
        this.parcelSize = parcelSize;
    }

    @Override
    public String toString() {
        return "House{"
                + "parcelSize=" + parcelSize
                + '}';
    }
}

class Residence extends House {
    private float garageSize;

    public Residence(String city, String street, float parcelSize, float garageSize) {
        super(city, street, parcelSize);
        this.setGarageSize(garageSize);
    }

    @Override
    public String toString() {
        return "Residence{"
                + "garageSize=" + garageSize
                + '}';
    }

    public float getGarageSize() {
        return garageSize;
    }

    public void setGarageSize(float garageSize) {
        this.garageSize = garageSize;
    }
}

public class J117PolymorphismChallenge {
    public static void main(String[] args) {
        Flat[] homes = new Flat[10];

        for (int i = 0; i < homes.length; i++) {
            int randomHome = (int) Math.floor(Math.random() * 3);

            if (randomHome == 0) {
                homes[i] = new Flat("Wrocław", "Kasztanowa");
            }
            if (randomHome == 1) {
                homes[i] = new House("Wrocław", "Malinowa", 12.0f);
            }
            if (randomHome == 2) {
                homes[i] = new Residence("Wrocław", "Truskawkowa", 22.0f, 30.0f);
            }
        }

        for (int i = 0; i < homes.length; i++) {
            Flat home = homes[i];
            if (home instanceof Residence) {
                Residence residence = (Residence) home;
                System.out.println(residence.getGarageSize());
                System.out.println(residence.toString());

            } else if (home instanceof House) {
                House house = (House) home;
                System.out.println(house.getParcelSize());
                System.out.println(house.toString());

            } else if (home instanceof Flat) {
                System.out.println(home.toString());
            }
        }
    }
}
