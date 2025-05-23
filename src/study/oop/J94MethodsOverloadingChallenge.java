package study.oop;

class Roadster {
    float topSpeed;
    float acceleration;
    float crazyTopSpeed;
    float crazyAcceleration;

    Roadster(float topSpeed, float acceleration) {
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
    }

    Roadster(float topSpeed, float acceleration, float crazyTopSpeed, float crazyAcceleration) {
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
        this.crazyTopSpeed = crazyTopSpeed;
        this.crazyAcceleration = crazyAcceleration;
    }

    public float getTopSpeed() {
        return this.topSpeed;
    }

    public float getTopSpeed(boolean crazyMode) {
        if (crazyMode) {
            return this.crazyTopSpeed;
        }
        return this.topSpeed;
    }

    public float getAcceleration() {
        return this.acceleration;
    }

    public float getAcceleration(boolean crazyMode) {
        if (crazyMode) {
            return this.crazyAcceleration;
        }
        return this.acceleration;
    }
}

public class J94MethodsOverloadingChallenge {
    public static void main(String args[]) {
        Roadster roadster1 = new Roadster(250.0f, 4.0f);
        System.out.println("Top speed: " + roadster1.getTopSpeed() + "Acceleration: " + roadster1.getAcceleration());

        Roadster roadster2 = new Roadster(250.0f, 4.0f, 300.0f, 1.9f);
        System.out.println("Top speed: " + roadster2.getTopSpeed(true) + "Acceleration: " + roadster2.getAcceleration(true));
    }
}
