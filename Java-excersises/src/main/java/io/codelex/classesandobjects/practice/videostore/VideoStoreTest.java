package io.codelex.classesandobjects.practice.videostore;

import java.sql.SQLOutput;
import java.util.Scanner;

public class VideoStoreTest {
    private static final int COUNT_OF_MOVIES = 2;
    static VideoStore gameStop = new VideoStore();

    public static void main(String[] args) {
        final Scanner keyboard = new Scanner(System.in);
        gameStop.addNewMovie("The Matrix", 9);
        gameStop.rentMovie("The Matrix");
        gameStop.addNewMovie("Star Wars Episode IV: A New Hope", 8);
        gameStop.rateMovie("The Matrix",8);
        gameStop.rateMovie("The Matrix",6);
        gameStop.rateMovie("Avatar", 10);

        System.out.println("Welcome to Gamestop - the largest movie retailer 20 years ago!");
        while (true) {
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 0 for EXIT");
            System.out.println("Choose 1 to fill video store");
            System.out.println("Choose 2 to rent video (as user)");
            System.out.println("Choose 3 to return video (as user)");
            System.out.println("Choose 4 to rate a video");
            System.out.println("Choose 5 to list all movies");

            int n = keyboard.nextInt();
            keyboard.nextLine();

            switch (n) {
                case 0:
                    System.exit(0);
                case 1:
                    fillVideoStore(keyboard);
                    break;
                case 2:
                    rentVideo(keyboard);
                    break;
                case 3:
                    returnVideo(keyboard);
                    break;
                case 4:
                    rateMovie(keyboard);
                    break;
                case 5:
                    listMovies();
                    break;
                default:
                    break;
            }
            System.out.println();

        }
    }

    private static void fillVideoStore(Scanner scanner) {
        for (int i = 0; i < COUNT_OF_MOVIES; i++) {
            System.out.println("Enter movie name");
            String movieName = scanner.nextLine();
            gameStop.addNewMovie(movieName);
        }
    }

    private static void rentVideo(Scanner scanner) {
        System.out.println("Enter movie name");
        String movieName = scanner.nextLine();
        if (gameStop.rentMovie(movieName)) {
            System.out.println("You got the movie!");
        } else {
            System.out.println("You entered incorrect data... Please try again..");
        }
    }

    private static void returnVideo(Scanner scanner) {
        System.out.println("Enter movie name");
        String movieName = scanner.nextLine();
        if (gameStop.returnMovie(movieName)) {
            System.out.println("You just returned the movie!");
            System.out.println("Please also rate the movie: ");
            int rating = scanner.nextInt();
            scanner.nextLine();
            gameStop.rateMovie(movieName, rating);
        } else {
            System.out.println("You entered incorrect data... Please try again..");
        }
    }

    private static void rateMovie(Scanner scanner) {
        System.out.println("Enter movie name");
        String movieName = scanner.nextLine();
        System.out.println("How much would you give to it in scale from 1 to 10? ");
        int rating = scanner.nextInt();
        scanner.nextLine();
        if (gameStop.rateMovie(movieName, rating)) {
            System.out.println("Movie '" + movieName + "' successfully rated!");
        } else {
            System.out.println("You entered incorrect data... Please try again..");
        }
    }

    private static void listMovies() {
        gameStop.listMovies();
    }
}
