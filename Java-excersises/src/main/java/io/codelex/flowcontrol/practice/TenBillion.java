package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class TenBillion {

    //TODO: Write a Java program that reads an positive integer and count the number of digits the number (less than ten billion) has.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a long number less than ten billion: ");

        long n;
        while (true) {
            if (in.hasNextLong()) {
                n = in.nextLong();
                break;
            } else {
                System.out.println("Please enter a value of type long: ");
                in.next();
            }
        }

        if (n < 0) {
            n *= -1;
        }
        if (n >= 10000000000L) {
            System.out.println("Number is greater or equals 10,000,000,000!");
        } else {
            int digits;
            if (n < 10) {
                digits = 1;
            } else if (n < 100) {
                digits = 2;
            } else if (n < 1000) {
                digits = 3;
            } else if (n < 10000) {
                digits = 4;
            } else if (n < 100000) {
                digits = 5;
            } else if (n < 1000000) {
                digits = 6;
            } else if (n < 10000000) {
                digits = 7;
            } else if (n < 100000000) {
                digits = 8;
            } else if (n < 1000000000) {
                digits = 9;
            } else {
                digits = 10;
            }
            System.out.println("Number of digits in the number: " + digits);
        }
    }
}
