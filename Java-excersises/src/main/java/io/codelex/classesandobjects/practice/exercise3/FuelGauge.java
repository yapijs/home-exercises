package io.codelex.classesandobjects.practice.exercise3;

public class FuelGauge {
    private static final int GAS_TANK_SIZE = 70;
    private double fuelAmountLeft;

    public FuelGauge(double fuelAmountLeft) {
        this.fuelAmountLeft = fuelAmountLeft;
    }

    public double getFuelAmount() {
        return fuelAmountLeft;
    }

    private boolean addFuel() {
        if (fuelAmountLeft < GAS_TANK_SIZE) {
            fuelAmountLeft++;
            return true;
        }
        return false;
    }

    public void consumeFuel() {
        if (fuelAmountLeft > 0) {
            fuelAmountLeft--;
        }
    }

    public void fillGasTank(int litres) {
        for (int i = 0; i < litres; i++) {
            boolean gasTankNotFull = addFuel();
            if (!gasTankNotFull) {
                break;
            }
        }
    }
}
