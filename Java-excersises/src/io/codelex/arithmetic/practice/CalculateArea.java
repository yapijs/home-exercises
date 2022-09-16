package io.codelex.arithmetic.practice;

import java.math.BigDecimal;
import java.util.Scanner;

import static java.math.BigDecimal.ZERO;

//    The methods should display an error message if negative values are used for the circle’s radius, the rectangle’s length or width, or the triangle’s base or height.

public class CalculateArea {
    public static void main(String[] args) {
        int choice; // The user's menu choice

        do {
            // Get the user's menu choice.
            choice = getMenu();

            if (choice == 1) {
                calculateCircleArea();
            } else if (choice == 2) {
                calculateRectangleArea();
            } else if (choice == 3) {
                calculateTriangleArea();
            } else if (choice == 4) {
                System.out.println("Thanks for calculating!");
            }

        } while (choice != 4);
    }

    public static int getMenu() {

        int userChoice;

        // keyboard input
        Scanner keyboard = new Scanner(System.in);

        // Display the menu.
        System.out.println("Geometry Calculator\n");
        System.out.println("1. Calculate the Area of a Circle");
        System.out.println("2. Calculate the Area of a Rectangle");
        System.out.println("3. Calculate the Area of a Triangle");
        System.out.println("4. Quit\n");
        System.out.print("Enter your choice (1-4) : ");

        // get input from user
        userChoice = keyboard.nextInt();

        // validate input
        while (userChoice < 1 || userChoice > 4) {
            System.out.print("Please enter a valid range: 1, 2, 3, or 4: ");
            userChoice = keyboard.nextInt();
        }

        return userChoice;
    }

    public static void calculateCircleArea() {
        System.out.print("What is the circle's radius? ");
        BigDecimal radius = enterValue();

        // Display output
        System.out.println("The circle's area is " + Geometry.areaOfCircle(radius));
    }

    public static void calculateRectangleArea() {
        System.out.print("Enter length? ");
        BigDecimal length = enterValue();

        System.out.print("Enter width? ");
        BigDecimal width = enterValue();

        // Display output
        System.out.println("The rectangle's area is "
                + Geometry.areaOfRectangle(length, width));
    }

    public static void calculateTriangleArea() {
        System.out.print("Enter length of the triangle's base? ");
        BigDecimal base = enterValue();

        System.out.print("Enter triangle's height? ");
        BigDecimal height = enterValue();

        // Display the triangle's area.
        System.out.println("The triangle's area is "
                + Geometry.areaOfTriangle(base, height));
    }

    public static BigDecimal enterValue() {
        Scanner keyboard = new Scanner(System.in);
        BigDecimal valueToCheck = keyboard.nextBigDecimal();
        while (valueToCheck.compareTo(ZERO) <= 0) {
            System.out.println("Please enter positive value!");
            valueToCheck = keyboard.nextBigDecimal();
        }
        return valueToCheck;
    }
}
