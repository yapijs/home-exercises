package io.codelex.loops.practice;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the max number : ");
        int maxNumber = in.nextInt();

        for (int i = 1; i <= maxNumber; i++) {
            if (i % 3 == 0) {
                System.out.print("Fizz");
            }
            if (i % 5 == 0) {
                System.out.print("Buzz");
            }
            if (i % 3 != 0 && i % 5 != 0) {
                System.out.print(i);
            }
            if (i % 20 == 0) {
                System.out.println();
            } else {
                System.out.print(" ");
            }
        }
    }
}
