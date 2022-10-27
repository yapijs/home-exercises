package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;

abstract class Animal {
    private String animalName;
    private String animalType;
    private Double animalWeight;
    private Integer foodEaten;

    public Animal(String animalType, String animalName, Double animalWeight) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
        this.foodEaten = 0;

        makeSounds();
    }

    public Integer getFoodEaten() {
        return foodEaten;
    }

    void addFoodEaten(Integer foodEaten) {
        this.foodEaten += foodEaten;
    }

    public String getAnimalName() {
        return animalName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public String getAnimalWeight() {
        DecimalFormat df = new DecimalFormat("0.#");
        return df.format(animalWeight);
    }

    public abstract void makeSounds();

    public abstract void eatFood(Food food);
}
