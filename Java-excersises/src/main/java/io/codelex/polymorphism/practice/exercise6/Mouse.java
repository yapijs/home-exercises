package io.codelex.polymorphism.practice.exercise6;

public class Mouse extends Mammal{
    public Mouse(String animalType, String animalName, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSounds() {
        System.out.println("Squeak, squeak!");
    }

    @Override
    public void eatFood(Food food) {
        if (food.toString().startsWith("Vegetables")) {
            addFoodEaten(food.getQuantity());
        } else {
            System.out.println("Mice are not eating that type of food!");
        }
    }


}
