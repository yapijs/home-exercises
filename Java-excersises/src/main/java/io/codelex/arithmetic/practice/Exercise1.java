package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise1 {
    //Write a Java program to accept two integers and return true if the either one is 15 or if their sum or difference is 15.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int input1 = scanner.nextInt();
        System.out.println("Enter number 2:");
        int input2 = scanner.nextInt();

        System.out.println("Value of function:" + checkForValue(input1, input2));

    }

    public static boolean checkForValue(int num1, int num2) {
        return num1 == 15 || num2 == 15 || num1 + num2 == 15 || Math.abs(num1 - num2) == 15;
    }
}
