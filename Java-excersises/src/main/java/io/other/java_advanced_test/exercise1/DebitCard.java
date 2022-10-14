package io.other.java_advanced_test.exercise1;

import java.math.BigDecimal;

public class DebitCard extends Card {
    public DebitCard(String number, String owner) {
        super(number, owner);
    }

    @Override
    public void deposit(double amount) {
        addMoney(BigDecimal.valueOf(amount));
        if (getBalance().doubleValue() > 10000) {
            System.out.println("Warning: Too much money");
        }
    }

    @Override
    public void withdraw(double amount) {
        subtractMoney(BigDecimal.valueOf(amount));
    }
}
