package io.other.java_advanced_test.exercise1;

import java.math.BigDecimal;

public class CreditCard extends Card {
    public CreditCard(String number, String owner) {
        super(number, owner);
    }

    @Override
    public void deposit(double amount) {
        addMoney(BigDecimal.valueOf(amount));
    }

    @Override
    public void withdraw(double amount) {
        subtractMoney(BigDecimal.valueOf(amount));
        if (getBalance().doubleValue() < 100) {
            System.out.println("Warning: Low funds");
        }
    }
}
