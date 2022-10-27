package io.codelex.polymorphism.practice.exercise6;

public class Cat extends Felime{
    private String breed;
    public Cat(String animalType, String animalName,Double animalWeight, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void makeSounds() {
        System.out.println("Meow!");
    }

    @Override
    public void eatFood(Food food) {
        if (food != null) {
            addFoodEaten(food.getQuantity());
        }
    }

    @Override
    public String toString() {
        return getAnimalType() + "[" + getAnimalName() + ", " + getBreed() + ", " + getAnimalWeight() + ", "+ getLivingRegion() + ", " + getFoodEaten() + "]";
    }
}
