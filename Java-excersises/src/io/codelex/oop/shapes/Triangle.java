package io.codelex.oop.shapes;

import static java.lang.Math.*;

public class Triangle extends Shape{
    private int height;
    private int base;

    public Triangle(int height, int base) {
        super(3);
        this.height = height;
        this.base = base;
    }

    @Override
    public int getArea() {
        return height * base / 2;
    }

    @Override
    public int getPerimeter() {
        int a = (int) sqrt(pow(height, 2) + pow(base / 2, 2));
        return a + a + base;
    }
}
