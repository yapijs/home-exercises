package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
//        Exercise #7
//        Write a program that prompts the user to enter a string and displays the number of the uppercase letters in the string.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the text:");
        String enteredText = scanner.next();

        System.out.println("Capital letters in this string: " + removeChars(enteredText).length() );
    }

    public static String removeChars(String str) {
        return str.replaceAll("[^A-Z]", "");
    }
}
