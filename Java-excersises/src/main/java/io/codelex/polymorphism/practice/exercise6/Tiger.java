package io.codelex.polymorphism.practice.exercise6;

public class Tiger extends Felime{
    public Tiger(String animalType, String animalName, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSounds() {
        System.out.println("ROAAR!!!!");
    }

    @Override
    public void eatFood(Food food) {
        if (food.toString().startsWith("Meat")) {
            addFoodEaten(food.getQuantity());
        } else {
            System.out.println("Tigers are not eating that type of food!");
        }
    }
}
