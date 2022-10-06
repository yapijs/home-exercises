package io.codelex.enums.practice.exercise2;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsApp {
    public static void main(String[] args) {
        System.out.println("Let us begin...");
        User pc = new User("PC");
        User player = new User("Player");
        int totalGamesPlayed = 0;
        while(true)
        {
            Rps userValue;
            String rawUserValue = getStringValueFromUser();
            if (rawUserValue.equals("q")) {
                break;
            } else {
                userValue = Rps.valueOfLabel(rawUserValue);
            }
            Rps pcValue = getValueFromPc();

            printResults(userValue, player, pcValue, pc);
            totalGamesPlayed++;
        }

        player.displayResults(totalGamesPlayed, pc);
    }

    private static void printResults(Rps userValue, User user, Rps pcValue, User pc){
        String output = "";
        if (userValue == Rps.ROCK && pcValue == Rps.SCISSORS) {
            output = "You won!";
            user.addWin();
        } else if (userValue == Rps.SCISSORS && pcValue == Rps.PAPER) {
            output = "You won!";
            user.addWin();
        } else if (userValue == Rps.PAPER && pcValue == Rps.ROCK) {
            output = "You won!";
            user.addWin();
        } else if (userValue == pcValue) {
            output = "It's a tie!";
        } else {
            output = "You lost!";
            pc.addWin();
        }
        System.out.println(output + "\n");
    }

    private static Rps getValueFromPc() {
        Random random = new Random();
        Rps value = Rps.values()[random.nextInt(3)];
        System.out.println("PC turn: " + value);
        return value;
    }

    private static String getStringValueFromUser() {
        Scanner scanner = new Scanner(System.in);
        String input;
        while (true) {
            System.out.println("Scissor-Paper-Rock");
            System.out.println("Your turn (Enter s for scissor, p for paper, r for rock, q to quit): ");
            input = scanner.nextLine();
            if (isInputValueValid(input)) {
                return input;
            } else {
                System.out.println("Invalid input, try again...");
            }
        }
    }

    private static boolean isInputValueValid(String inputValue) {
        return inputValue.equals("r") || inputValue.equals("s") || inputValue.equals("p") || inputValue.equals("q");
    }
}
