package io.codelex.oop.exercise9;

import java.text.DecimalFormat;

public class FiguresApp {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4, 6);
        System.out.println("Area of rectangle:" + format(rectangle1.getArea()));
        System.out.println("Perimeter of rectangle:" +format(rectangle1.getPerimeter()));

        Triangle triangle1 = new Triangle(4, 6);
        System.out.println("Area of triangle:" + format(triangle1.getArea()));
        System.out.println("Perimeter of triangle:" + format(triangle1.getPerimeter()));

        Hexagon hexagon1 = new Hexagon(5);
        System.out.println("Area of hexagon:" + format(hexagon1.getArea()));
        System.out.println("Perimeter of hexagon:" + format(hexagon1.getPerimeter()));

    }

    public static String format(double value) {
        return new DecimalFormat("#.##").format(value);
    }

}
