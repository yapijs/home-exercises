package io.codelex.polymorphism.practice.exercise1;

public class Volvo implements Car{
    private Integer currentSpeed = 0;
    private String name;

    public Volvo(String name) {
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
    public void startEngine() {
        System.out.println("Rrrrrrr.....");
    }
}
