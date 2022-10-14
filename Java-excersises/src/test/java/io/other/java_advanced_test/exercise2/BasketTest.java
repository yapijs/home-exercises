package io.other.java_advanced_test.exercise2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BasketTest {

    @Test
    void testAssertWhenEmptyBasketAndRemoveElement() {
        Exception exception = assertThrows(BasketEmptyException.class, () -> {
            Basket<Apple> appleBasket = new Basket<>();
            appleBasket.removeFromBasket();
        });

        String expectedMessage = "Basket is empty! Nothing to remove!";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void testAssertWhenFullBasketAndAddElement() {
        Exception exception = assertThrows(BasketFullException.class, () -> {
            Basket<Mushroom> mushroomBasketBasket = new Basket<>();
            mushroomBasketBasket.addToBasket(new Mushroom());
            mushroomBasketBasket.addToBasket(new Mushroom());
            mushroomBasketBasket.addToBasket(new Mushroom());
            mushroomBasketBasket.addToBasket(new Mushroom());
            mushroomBasketBasket.addToBasket(new Mushroom());

            mushroomBasketBasket.addToBasket(new Mushroom());
            mushroomBasketBasket.addToBasket(new Mushroom());
            mushroomBasketBasket.addToBasket(new Mushroom());
            mushroomBasketBasket.addToBasket(new Mushroom());
            mushroomBasketBasket.addToBasket(new Mushroom());

            mushroomBasketBasket.addToBasket(new Mushroom());
        });

        String expectedMessage = "Basket is full! You cannot add any more items!";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void testAddApples() {
        Basket<Apple> appleBasket = new Basket<>();
        appleBasket.addToBasket(new Apple());
        appleBasket.addToBasket(new Apple());
        appleBasket.addToBasket(new Apple());
        appleBasket.addToBasket(new Apple());
        appleBasket.addToBasket(new Apple());
        appleBasket.addToBasket(new Apple());

        assertEquals(6, appleBasket.getNumberOfItems());
    }

}
