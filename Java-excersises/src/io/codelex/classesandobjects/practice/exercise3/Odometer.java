package io.codelex.classesandobjects.practice.exercise3;

public class Odometer {
    private int currentMileage;

    public int getCurrentMileage() {
        return currentMileage;
    }

    public Odometer(int currentMileage) {
        this.currentMileage = currentMileage;
    }

    public void carIsMoving(FuelGauge fuelGauge) {
        currentMileage++;
        if (currentMileage > 999999) {
            currentMileage = 0;
        }
        if (currentMileage % 10 == 0) {
            fuelGauge.consumeFuel();
        }
    }

//    public void fillGasTank(int litres) {
//        for (int i = 0; i < litres; i++) {
//            fuelGauge.addFuel();
//        }
//    }
}
