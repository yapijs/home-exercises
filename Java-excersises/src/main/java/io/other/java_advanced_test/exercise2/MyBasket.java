package io.other.java_advanced_test.exercise2;

public class MyBasket {
    public static void main(String[] args) {
        Basket<Apple> appleBasket = new Basket<>();
        appleBasket.addToBasket(new Apple());
        appleBasket.addToBasket(new Apple());
        appleBasket.removeFromBasket();
        appleBasket.removeFromBasket();
        appleBasket.removeFromBasket();
    }

}
