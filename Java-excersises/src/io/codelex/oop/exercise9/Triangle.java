package io.codelex.oop.exercise9;

public class Triangle extends Shape{
    private double base;
    private double height;


    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return base * height / 2;
    }

    @Override
    public double getPerimeter() {
        return base * 3;
    }
}
