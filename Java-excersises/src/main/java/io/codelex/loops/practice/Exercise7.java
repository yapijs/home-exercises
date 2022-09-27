package io.codelex.loops.practice;

import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Random;
import java.util.Scanner;

public class Exercise7 {
    //Write a console program in a class named Piglet that implements a simple 1-player dice game called "Piglet" (based on the game "Pig").
    // The player's goal is to accumulate as many points as possible without rolling a 1. Each turn, the player rolls the die;
    // if they roll a 1, the game ends and they get a score of 0. Otherwise, they add this number to their running total score.
    // The player then chooses whether to roll again, or end the game with their current point total.
    //You can use the method readBoolean to ask the user a yes/no question.
    public static void main(String[] args) {
        System.out.println("Welcome to Piglet!");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean continueGame = true;
        int score = 0;
        boolean notLost = true;

        do {
            int number = random.nextInt(6) + 1;
            System.out.println("You rolled a " + number + "!");
            if (number == 1) {
                score = 0;
                continueGame = false;
                //notLost = false;
            } else {
                score += number;
                System.out.println("Roll again?");
                String text = scanner.nextLine();
                if (willRollAgain(text)) {
                    continueGame = false;
                }
            }
        } while (continueGame);

        if (score == 1) {
        System.out.println("You got 1 point.");
        } else {
            System.out.println("You got " + score + " points.");
        }
    }

    public static boolean willRollAgain(String input) {
        return input.isEmpty() || input.toLowerCase().equals("no") || input.toLowerCase().equals("false") || input.toLowerCase().equals("n");
    }
}
