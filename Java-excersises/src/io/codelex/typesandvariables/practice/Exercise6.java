package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise6 {

//    Write a program that asks the user to enter a series of single digit numbers and calculate the sum of all the numbers.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Sum app");
        System.out.println("to Exit press 0");
        System.out.println("Enter single digit numbers:");
        while(true) {
            int num = scanner.nextInt();
            if (num > 0 && num < 10) {
                sum += num;
            } else if (num == 0) {
                break;
            } else {
                System.out.println("Wrong number. You entered negative or multiple digit number");
            }
        }
        System.out.println("Sum of all single digit numbers is " + sum);
    }
}
