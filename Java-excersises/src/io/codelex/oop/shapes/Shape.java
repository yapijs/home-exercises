package io.codelex.oop.shapes;

public abstract class Shape {
    int numSides;

    public Shape(int numSides) {
        this.numSides = numSides;
    }

    public int getNumSides() {
        return numSides;
    }

    public abstract int getArea();
    public abstract int getPerimeter();
}
