package io.codelex.typesandvariables.practice;

public class MoreVariablesAndPrinting {
    public static void main(String[] args) {
        String name = "Zed A. Shaw";
        int age = 35;
        int height = 74;  // inches
        int weight = 180; // lbs

        double heightCm = height * 2.54D;
        double weightKg = weight * 0.453592D;

        String eyes = "blue";
        String teeth = "white";
        String hair = "brown";

        System.out.println("Let's talk about " + name + ".");
        System.out.println("He's " + String.format("%.2f", heightCm) + " cm tall.");
        System.out.println("He's " + String.format("%.2f", weightKg) + " kg heavy.");
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + eyes + " eyes and " + hair + " hair.");
        System.out.println("His teeth are usually " + teeth + " depending on the coffee.");

        System.out.println("If I add " + age + ", " + String.format("%.2f", heightCm) + ", and "
                + String.format("%.2f", weightKg) + " I get "
                + String.format("%.2f", (age + heightCm + weightKg)) + ".");
    }
}