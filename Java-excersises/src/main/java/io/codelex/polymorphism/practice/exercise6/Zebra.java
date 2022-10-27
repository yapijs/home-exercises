package io.codelex.polymorphism.practice.exercise6;

public class Zebra extends Mammal{
    public Zebra(String animalType, String animalName, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSounds() {
        System.out.println("Snorts!");
    }

    @Override
    public void eatFood(Food food) {
        if (food.toString().startsWith("Vegetables")) {
            addFoodEaten(food.getQuantity());
        } else {
            System.out.println("Zebras are not eating that type of food!");
        }
    }


}
