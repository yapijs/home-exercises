package io.codelex.classesandobjects.practice.videostore;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Objects;

public class Video {
    private final String title;
    private boolean atStore = true;
    private BigDecimal averageRating = BigDecimal.ZERO;
    private int timesRented = 0;
    private int sumOfAllRating = 0;

    public Video(String title) {
        this.title = title;
    }

    public Video(String title, int rating) {
        this.title = title;
        addNewRating(rating);
    }

    public String getTitle() {
        return title;
    }

    public boolean rentOut() {
        if (!atStore) {
            return false;
        }
        this.atStore = false;
        return true;
    }

    public boolean returnVideo() {
        if (atStore) {
            return false;
        }
        this.atStore = true;
        return true;
    }

    public void addNewRating(int rating) {
        sumOfAllRating += rating;
        timesRented++;
        this.averageRating = BigDecimal.valueOf(sumOfAllRating).divide(BigDecimal.valueOf(timesRented), new MathContext(3));
    }

    public boolean isAtStore() {
        return atStore;
    }

    @Override
    public String toString() {
        String isPresent = "";
        if (isAtStore()) {
            isPresent = "status: present";
        } else {
            isPresent = "status: rented out";
        }
        return title + ", " + isPresent + ", " + averageRating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Video video = (Video) o;
        return atStore == video.atStore && Objects.equals(title, video.title) && Objects.equals(averageRating, video.averageRating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, atStore, averageRating);
    }
}
