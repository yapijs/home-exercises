package io.codelex.polymorphism.practice.exercise6;

public class Meat extends Food{
    public Meat(Integer quantity) {
        super(quantity);
    }

    @Override
    public String toString() {
        return "Meat " + getQuantity();
    }
}
