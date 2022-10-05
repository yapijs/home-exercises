package io.codelex.enums.practice.exercise2;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class User {
    private String name;
    private int score;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void addWin() {
        this.score++;
    }

    private String calculateWinPercentage(int totalGames) {
        NumberFormat format = NumberFormat.getPercentInstance();
        format.setMinimumFractionDigits(2);
        BigDecimal result = BigDecimal.valueOf(this.getScore()).divide(BigDecimal.valueOf(totalGames));
        return this.name + " won " + this.score + "(" + format.format(result.doubleValue()) + ").";
    }

    public void displayResults(int totalGames, User opponent) {
        System.out.println("Number of trials: " + totalGames);
        System.out.println(calculateWinPercentage(totalGames) + " " + opponent.calculateWinPercentage((totalGames)));
        System.out.println("Bye!");
    }
}
