package io.codelex.polymorphism.practice.exercise1;

import java.util.Objects;

public class Jaguar implements Car, NitrousOxideEngine {
    private Integer currentSpeed = 0;
    private String name;
    public Jaguar(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public void speedUp() {
        currentSpeed += 14;
    }

    @Override
    public void slowDown() {
        currentSpeed += 14;
    }

    @Override
    public int showCurrentSpeed() {
        return currentSpeed;
    }

    @Override
    public void useNitrousOxideEngine() {
        System.out.println("NOS enabled for " + getName());
        currentSpeed = currentSpeed + 30;
    }

    @Override
    public void startEngine() {
        System.out.println("Rrrrrrr.....");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jaguar jaguar = (Jaguar) o;
        return Objects.equals(currentSpeed, jaguar.currentSpeed) && Objects.equals(name, jaguar.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentSpeed, name);
    }
}
