package io.codelex.classesandobjects.practice.exercise1;

public class Product {
    private String name;
    private double priceAtStart;
    private int amountAtStart;

    public Product(String name, double priceAtStart, int amountAtStart) {
        this.name = name;
        this.priceAtStart = priceAtStart;
        this.amountAtStart = amountAtStart;
    }

    public void printProduct(){
        System.out.println(name + ", price " + priceAtStart + ", amount " + amountAtStart);
    }

    public void setPrice(double price) {
        this.priceAtStart = price;
    }

    public void setAmount(int amount) {
        this.amountAtStart = amount;
    }


}
