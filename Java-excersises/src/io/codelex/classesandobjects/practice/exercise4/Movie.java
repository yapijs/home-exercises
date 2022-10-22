package io.codelex.classesandobjects.practice.exercise4;

import java.util.Objects;

public class Movie {
    private final String title;
    private final String studio;
    private final String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this(title, studio, "PG");
    }

    public String getTitle() {
        return title;
    }

    public String getStudio() {
        return studio;
    }

    public String getRating() {
        return rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(title, movie.title) && Objects.equals(studio, movie.studio) && Objects.equals(rating, movie.rating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, studio, rating);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", studio='" + studio + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }
}
