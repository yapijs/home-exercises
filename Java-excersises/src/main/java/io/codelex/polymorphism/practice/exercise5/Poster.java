package io.codelex.polymorphism.practice.exercise5;

public class Poster extends Advert {
    private PosterSizes posterSize;
    private int numberOfCopies;
    //private double rate;

    public Poster(int fee, PosterSizes posterSize, int numberOfCopies) {
        super(fee);
        this.posterSize = posterSize;
        this.numberOfCopies = numberOfCopies;
        //this.rate = rate;
    }

    @Override
    public int cost() {
        return super.cost() + posterSize.getTotal(numberOfCopies);
    }

    @Override
    public String toString() {
        return super.toString()
                + " Posters: size =" + posterSize
                + "; amount =" + numberOfCopies ;
    }
}
