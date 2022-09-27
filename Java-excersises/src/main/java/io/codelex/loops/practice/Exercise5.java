package io.codelex.loops.practice;

import java.util.Scanner;

public class Exercise5 {
    //Write a program that asks the user to enter two words. The program then prints out both words on one line.
    // The words will be separated by enough dots so that the total line length is 30
    public static void main(String[] args) {

        final int MAX_LINE_LENGTH = 30;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first word: ");
        String first = scanner.next();
        System.out.println("Enter the second word: ");
        String second = scanner.next();

        System.out.print(first);
        for (int i = 0; i < MAX_LINE_LENGTH - first.length() - second.length(); i++) {
            System.out.print(".");
        }
        System.out.println(second);

    }
}
