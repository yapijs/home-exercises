package io.codelex.polymorphism.practice.exercise1;

import java.util.Objects;

public class Lexus implements Car, NitrousOxideEngine {
    private Integer currentSpeed = 0;
    private String name;

    public Lexus(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void speedUp() {
        currentSpeed += 8;
    }

    @Override
    public void slowDown() {
        currentSpeed += 8;
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
        Lexus lexus = (Lexus) o;
        return Objects.equals(currentSpeed, lexus.currentSpeed) && Objects.equals(name, lexus.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentSpeed, name);
    }
}
