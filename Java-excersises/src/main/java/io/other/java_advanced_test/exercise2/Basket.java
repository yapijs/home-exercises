package io.other.java_advanced_test.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {
    private List<T> listOfItems = new ArrayList<>();

    public int getNumberOfItems() {
        return listOfItems.size();
    }

    public void addToBasket(T item) {
        if (listOfItems.size() == 10) {
            throw new BasketFullException("Basket is full! You cannot add any more items!");
        }
        listOfItems.add(item);
    }

    public void removeFromBasket() {
        if (listOfItems.size() == 0) {
            throw new BasketEmptyException("Basket is empty! Nothing to remove!");
        }
        listOfItems.remove(listOfItems.size()-1);
    }

}
