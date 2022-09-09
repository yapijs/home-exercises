package io.codelex.arithmetic.practice;

import java.text.DecimalFormat;

public class Exercise9 {
//    Write a program that calculates and displays a person's body mass index (BMI). A person's BMI is calculated with the following formula:
//    BMI = weight x 703 / height ^ 2. Where weight is measured in pounds and height is measured in inches.
//    Display a message indicating whether the person has optimal weight, is underweight, or is overweight.
//    A sedentary person's weight is considered optimal if his or her BMI is between 18.5 and 25. If the BMI is less than 18.5,
//    the person is considered underweight. If the BMI value is greater than 25, the person is considered overweight.
//    Your program must accept metric units.

    public static void main(String[] args) {
        System.out.println(calculateBMI(72,1.81));
        System.out.println(calculateBMI(60,1.76));
    }

    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static String calculateBMI(double weightInKg, double heightInM) {
        double weight = weightInKg * 2.205;
        double height = heightInM * 39.37;
        //double BMI = weight * 703 / Math.pow(height, 2);
        double BMI = weightInKg / Math.pow(heightInM, 2);
        if (BMI < 18.5) {
            System.out.println("The person is considered underweight.");
        } else if (BMI > 25) {
            System.out.println("The person is considered overweight.");
        } else {
            System.out.println("The person has optimal weight.");
        }
        return df.format(BMI);
    }
}
