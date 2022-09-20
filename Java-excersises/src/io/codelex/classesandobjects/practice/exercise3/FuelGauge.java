package io.codelex.classesandobjects.practice.exercise3;

public class FuelGauge {
    private double fuelAmountLeft;

    public FuelGauge(double fuelAmountLeft) {
        this.fuelAmountLeft = fuelAmountLeft;
    }

    public double getFuelAmount() {
        return fuelAmountLeft;
    }

    public void addFuel() {
        if (fuelAmountLeft < 70) {
            fuelAmountLeft++;
        }
    }

    public void consumeFuel() {
        if (fuelAmountLeft > 0) {
            fuelAmountLeft--;
        }
    }
}
