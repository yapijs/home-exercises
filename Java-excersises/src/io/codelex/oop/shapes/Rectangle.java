package io.codelex.oop.shapes;

public class Rectangle extends Shape{
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        super(4);
        this.height = height;
        this.width = width;
    }


    @Override
    public int getArea() {
        return height * width;
    }

    @Override
    public int getPerimeter() {
        return 2 * height + 2 * width;
    }
}
