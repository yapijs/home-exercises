package io.codelex.polymorphism.practice.exercise5;

public enum PosterSizes {
    S (10),

    M (18),
    L (33),
    XL (55);

    private int pricePerTen;

    PosterSizes(int pricePerTen) {
        this.pricePerTen = pricePerTen;
    }

    public int getTotal(int amount)  {
        int units = amount / 10;
        if (amount % 10 != 0) {
            units++;
        }
        return units * pricePerTen;
    }

}
