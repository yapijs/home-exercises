package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise2 {
    //Write a program called CheckOddEven which prints "Odd Number" if the int variable “number” is odd, or “Even Number” otherwise.
    // The program shall always print “bye!” before exiting.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CheckOddEven checkOddEven = new CheckOddEven(scanner.nextInt());
    }

    public static class CheckOddEven {
        public CheckOddEven(int number) {
            if (number%2 == 1) {
                System.out.println("Odd number");
            } else {
                System.out.println("Even number");
            }
            System.out.println("bye!");
        }
    }
}
