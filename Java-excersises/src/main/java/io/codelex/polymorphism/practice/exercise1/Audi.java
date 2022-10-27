package io.codelex.polymorphism.practice.exercise1;

public class Audi implements Car{
    private String name;
    private Integer currentSpeed = 0;

    public Audi(String name) {
        this.name = name;
    }

    @Override
    public void speedUp() {
        currentSpeed += 10;
    }

    @Override
    public void slowDown() {
        currentSpeed += 10;
    }

    @Override
    public int showCurrentSpeed() {
        return currentSpeed;
    }

    @Override
    public void startEngine() {
        System.out.println("Rrrrrrr.....");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
