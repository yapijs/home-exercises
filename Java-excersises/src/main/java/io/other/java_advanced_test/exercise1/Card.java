package io.other.java_advanced_test.exercise1;

import java.math.BigDecimal;
import java.util.Random;

public abstract class Card {
    private String number;
    private String owner;
    private String ccv;
    private BigDecimal balance = BigDecimal.ZERO;

    public Card(String number, String owner) {
        this.number = number;
        this.owner = owner;
        this.ccv = ccvGenerator();
    }

    public String getNumber() {
        return number;
    }

    public String getOwner() {
        return owner;
    }

    public String getCcv() {
        return ccv;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    void addMoney(BigDecimal amount) {
        if (validateAmount(amount)) {
            balance = balance.add(amount);
        }
    }

    void subtractMoney(BigDecimal amount) {
        if (validateAmount(amount)) {
            if (getBalance().subtract(amount).compareTo(BigDecimal.ZERO) < 0) {
                throw new NotEnoughFundsException("Not enough funds!");
            }
            balance = balance.subtract(amount);
        }
    }

    private boolean validateAmount (BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) != 1) {
            System.out.println("Amount have to be greater than 0!");
            return false;
        } else {
            return true;
        }
    }

    private String ccvGenerator() {
        String ccv = "0";
        Random random = new Random();
        ccv += random.nextInt(1, 10);
        ccv += random.nextInt(0, 10);
        return ccv;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    @Override
    public String toString() {
        return "Card{" +
                "number='" + number + '\'' +
                ", owner='" + owner + '\'' +
                ", ccv='" + ccv + '\'' +
                ", balance=" + balance +
                '}';
    }
}
