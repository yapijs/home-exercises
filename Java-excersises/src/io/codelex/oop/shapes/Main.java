package io.codelex.oop.shapes;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 4);
        System.out.println("Area of rectangle is " + rectangle.getArea());
        System.out.println("Perimeter of rectangle is " + rectangle.getPerimeter());
        System.out.println("Rectangle has " + rectangle.getNumSides() + " sides");

        Triangle triangle = new Triangle(2, 4);
        System.out.println("Area of triangle is " + triangle.getArea());
        System.out.println("Perimeter of triangle is " + triangle.getPerimeter());
        System.out.println("Triangle has " + triangle.getNumSides() + " sides");
    }
}
