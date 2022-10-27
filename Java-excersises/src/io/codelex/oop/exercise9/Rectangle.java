package io.codelex.oop.exercise9;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return length * 2 + width * 2;
    }
}
