package io.codelex.oop.computers;

import java.util.Objects;

public class Laptop extends Computer{
    double battery;

    public Laptop(String processor, int ram, String graphicsCard, String company, String model, double battery) {
        super(processor, ram, graphicsCard, company, model);
        this.battery = battery;
    }

    public double getBattery() {
        return battery;
    }

    public void setBattery(double battery) {
        this.battery = battery;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return Double.compare(laptop.battery, battery) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), battery);
    }

    @Override
    public String toString() {

        return super.toString() + " / Laptop{" +
                "battery=" + battery +
                '}';
    }
}
