package io.codelex.oop.exercise10;

public class Cube extends Shape3D {
    private int edge;

    public Cube(int edge) {
        this.edge = edge;
    }


    @Override
    public double getVolume() {
        return Math.pow(edge, 3);
    }

    @Override
    public double getArea() {
        return 6 * Math.pow(edge, 2);
    }

    @Override
    public double getPerimeter() {
        return 12 * edge;
    }
}
