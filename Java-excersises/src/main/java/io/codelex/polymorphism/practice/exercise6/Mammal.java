package io.codelex.polymorphism.practice.exercise6;

abstract class Mammal extends Animal {
    private String livingRegion;

    public Mammal(String animalType, String animalName, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight);
        this.livingRegion = livingRegion;
    }

    public String getLivingRegion() {
        return livingRegion;
    }

    @Override
    public String toString() {
        return getAnimalType() + "[" + getAnimalName() + ", " + getAnimalWeight() + ", "+ getLivingRegion() + ", " + getFoodEaten() + "]";
    }
}
