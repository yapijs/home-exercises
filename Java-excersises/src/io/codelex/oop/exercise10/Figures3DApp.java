package io.codelex.oop.exercise10;

import java.text.DecimalFormat;

public class Figures3DApp {
    public static void main(String[] args) {
        Cone cone1 = new Cone(4, 6);
        System.out.println("Area of cone:" + format(cone1.getArea()));
        System.out.println("Perimeter of cone:" + format(cone1.getPerimeter()));
        System.out.println("Volume of cone:" + format(cone1.getVolume()));

        Cube cube1 = new Cube(6);
        System.out.println("Area of cube:" + format(cube1.getArea()));
        System.out.println("Perimeter of cube:" + format(cube1.getPerimeter()));
        System.out.println("volume of cube:" + format(cube1.getVolume()));

    }

    public static String format(double value) {
        return new DecimalFormat("#.##").format(value);
    }
}
