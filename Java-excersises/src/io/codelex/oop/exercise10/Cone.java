package io.codelex.oop.exercise10;

public class Cone extends Shape3D{
    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }


    @Override
    public double getVolume() {
        return Math.PI * Math.pow(radius, 2) * height / 3;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * (radius + Math.sqrt(Math.pow( height, 2) + Math.pow(radius, 2)));
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
