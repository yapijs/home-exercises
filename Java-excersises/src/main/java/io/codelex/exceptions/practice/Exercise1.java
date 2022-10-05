package io.codelex.exceptions.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Enter the numerator");
                int numerator = scanner.nextInt();
                System.out.println("Enter the divisor");
                int divisor = scanner.nextInt();
                System.out.println(numerator + " / " + divisor + " = " + numerator / divisor);
            } catch (ArithmeticException e) {
                System.out.println("Do not divide by 0");
            }
            catch (InputMismatchException e) {
                String input = scanner.nextLine();
                if (input.toLowerCase().startsWith("q")) {
                    break;
                }
                System.out.println("You entered bad data.");
                System.out.println("Please try again.");
            }
        }
    }
}
