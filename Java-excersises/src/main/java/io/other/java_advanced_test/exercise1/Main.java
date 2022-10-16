package io.other.java_advanced_test.exercise1;
/*## Exercise #1

        #### (inheritance + abstract classes + exceptions)

        #### Bank cards.
        There exist two types of bank cards - debit cards and credit cards. In a nutshell in case of debit card
        you spend your own money but with credit cards you spend bank's money that you have to give back eventually.

        Each card should have :
        * its number
        * its owner (full name)
        * CCV code (three digit number but it can start with 0, 045 for example)
        * balance - how much money is left on the card

        Both cards should have methods to add money and to take money and both cards should throw NotEnoughFundsException
        if its not possible to take out the amount you are requesting

        Difference between cards:
        * Credit card should print out "Warning: Low funds" every time when you take money from credit card and money left in the card is less than 100
        * Debit card should print out "Warning: Too much money" every time when you add money and the money in the card is more than 10 000

        Create three classes - abstract class Card and regular classes CreditCard, DebitCard that will extend the abstract class.
        Decide what should be in parent class and what should be in child classes.*/
public class Main {
    public static void main(String[] args) {

        DebitCard debitCard = new DebitCard("LV12345", "Peter Smith", "057");
        debitCard.deposit(100);
        debitCard.deposit(10050);
        System.out.println(debitCard);
        //debitCard.withdraw(100000);

        CreditCard creditCard = new CreditCard("LV987654", "Donald Duck", "012");
        creditCard.deposit(60);
        creditCard.deposit(10050);
        System.out.println(creditCard);
        creditCard.withdraw(10000);
        System.out.println(creditCard);
        creditCard.withdraw(100);
        System.out.println(creditCard);
        creditCard.withdraw(100);
    }
}
