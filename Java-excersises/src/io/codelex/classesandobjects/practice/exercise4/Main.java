package io.codelex.classesandobjects.practice.exercise4;

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Casino Royale" , "Eon Productions", "PG13");
        Movie movie2 = new Movie("Glass" , "Buena Vista International", "PG13");
        Movie movie3 = new Movie("Spider-Man: Into the Spider-Verse" , "Columbia Pictures", "PG");
        Movie[] listOfMovies = {movie1, movie2, movie3};
        System.out.println("List of all movies:");

        for (Movie m: listOfMovies) {
            System.out.println(m);
        }

        System.out.println("\nPG movies are:");
        for (Movie m: getPG(listOfMovies)) {
            System.out.println(m);
        }

    }

    static Movie[] getPG(Movie[] movies) {
        Movie[] pgMovies = new Movie[movies.length];
        int index = 0;
        for (Movie m: movies) {
            if (m.rating.equals("PG")) {
                pgMovies[index] = m;
                index++;
            }
        }
        return pgMovies;
    }
}
