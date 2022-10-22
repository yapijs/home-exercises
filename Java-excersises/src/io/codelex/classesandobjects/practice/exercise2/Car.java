package io.codelex.classesandobjects.practice.exercise2;

public class Car {
    private static final int GAS_HOG_THRESHOLD = 15;
    private static final int ECONOMIC_CAR_THRESHOLD = 5;
    private double startKilometers; // Starting odometer reading
    private double endKilometers; // Ending odometer reading
    private double liters; // Liters of gas used between the readings

    public Car(double startKilometers) {
        this.startKilometers = startKilometers;
    }

    public double calculateConsumption() {
        return liters * 100 / (endKilometers - startKilometers);
    }

    void fillUp(int mileage, double liters) {
        this.endKilometers = mileage;
        this.liters += liters;
    }

    public boolean isGasHog() {
        return calculateConsumption() > GAS_HOG_THRESHOLD;
    }

    public boolean isEconomyCar() {
        return calculateConsumption() < ECONOMIC_CAR_THRESHOLD;
    }
}
