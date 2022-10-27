package io.codelex.polymorphism.practice.exercise6;

abstract class Food {
    private Integer quantity;

    public Food(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public abstract String toString();
}
