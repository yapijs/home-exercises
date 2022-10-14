package io.other.java_advanced_test.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {
    private int numberOfItems;
    private List<T> listOfItems = new ArrayList<>();

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void addToBasket(T item) {
        if (numberOfItems == 10) {
            throw new BasketFullException("Basket is full! You cannot add any more items!");
        }
        listOfItems.add(item);
        numberOfItems = listOfItems.size();
    }

    public void removeFromBasket() {
        if (numberOfItems == 0) {
            throw new BasketEmptyException("Basket is empty! Nothing to remove!");
        }
        listOfItems.remove(listOfItems.size()-1);
        numberOfItems = listOfItems.size();
    }

}
