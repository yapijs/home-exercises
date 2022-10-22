package io.codelex.arrays.practice;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hangman {
    private static final String[] listOfWords = {
            "remember", "juvenile", "gun", "needy", "leather", "spring", "weight", "planes",
            "knotty", "chickens", "bird", "pray", "chilly", "box", "secretary", "high", "end",
            "bucket", "possible", "dark", "extend", "suspect", "jolly", "determined", "pink",
            "girls", "acrid", "inform", "unusual", "embarrassed"
    };
    private static String wordToGuess;
    private static int turnsLeft;
    private static String wordToGuessHidden;
    private static String missedLetters;
    private static final Scanner scanner = new Scanner(System.in);



    public static void main(String[] args) {

        boolean playGame = true;
        while (playGame) {
            instantiateGame();
            while (turnsLeft > 0 && !isWordGuessed()) {
                displayField();
                updateWordStatus(enterCharacter());
                turnsLeft--;
            }
            displayField();
            displayResult();

            while (true) {
                System.out.println("\nPlay \"again\" or \"quit\"?");
                String in = scanner.nextLine().toLowerCase().trim();
                if (in.equals("quit")) {
                    playGame = false;
                    break;
                } else if (in.equals("again")) {
                    break;
                } else {
                    System.out.println("Sorry, can You repeat? ");
                }
            }
        }
    }

    private static void instantiateGame() {
        wordToGuess = listOfWords[new Random().nextInt(listOfWords.length)];
        wordToGuessHidden = wordToGuess.replaceAll("\\w", "_ ");
        if (wordToGuess.length() < 6) {
            turnsLeft = wordToGuess.length() * 3;
        } else {
            turnsLeft = wordToGuess.length() * 2;
        }
        missedLetters = "";
    }
    private static boolean isWordGuessed() {
        return !wordToGuessHidden.contains("_");
    }

    private static void updateWordStatus(String guessedCharacter) {
        StringBuilder hiddenWordNew = new StringBuilder();
        if (wordToGuess.contains(guessedCharacter)) {
            for (int i = 0; i < wordToGuess.length(); i++) {
                if (String.valueOf(wordToGuess.charAt(i)).equals(guessedCharacter)) {
                    hiddenWordNew.append(wordToGuess.charAt(i)).append(" ");
                } else {
                    hiddenWordNew.append(wordToGuessHidden.charAt(i*2)).append(wordToGuessHidden.charAt(i*2+1));
                }
            }
            wordToGuessHidden = hiddenWordNew.toString();
        } else {
            missedLetters += guessedCharacter;
        }
    }

    private static String enterCharacter() {
        boolean validCharacter = false;
        String character = "";
        Pattern pattern = Pattern.compile("[a-zA-Z]");
        while (!validCharacter) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (input.length() == 1 && matcher.find()) {
                validCharacter = true;
                character = matcher.group();
            } else {
                System.out.println("You entered invalid data! Guess again: ");
            }
        }
        return character;
    }

    private static void displayResult() {
        if (isWordGuessed() ) {
            System.out.println("YOU GOT IT!");
        } else {
            System.out.println("You lost! The secret word was '" + wordToGuess + "'");
        }
    }
    public static void displayField() {
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
        System.out.println("Word: " + wordToGuessHidden + "\n");
        System.out.println("Misses: " + missedLetters + "\n");
        System.out.println("You have " + turnsLeft + " turns left.");
        if (!isWordGuessed() && turnsLeft > 0) {
            System.out.println("Guess: ");
        }
    }
}
