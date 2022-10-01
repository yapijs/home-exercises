package io.codelex.arithmetic.practice;

import java.util.Random;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
//        Write a program that picks a random number from 1-100. Give the user a chance to guess it. If they get it right, tell them so.
//        If their guess is higher than the number, say "Too high." If their guess is lower than the number, say "Too low." Then quit.
//        (They don't get any more guesses for now.)
//        I'm thinking of a number between 1-100.  Try to guess it.
//        Sorry, you are too low.  I was thinking of 34.

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int intInMemory = random.nextInt(100) + 1;

        System.out.println("I'm thinking of a number between 1-100. Try to guess it.");
        int userGuess = scanner.nextInt();

        if (intInMemory == userGuess) {
            System.out.println("Yes! You got it! I was thinking of " + intInMemory + ".");
        } else if (intInMemory > userGuess) {
            System.out.println("Sorry, you are too low. I was thinking of " + intInMemory + ".");
        } else {
            System.out.println("Sorry, you are too high. I was thinking of " + intInMemory + ".");
        }
    }
}
