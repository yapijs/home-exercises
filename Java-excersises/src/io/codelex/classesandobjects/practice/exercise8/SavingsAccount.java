package io.codelex.classesandobjects.practice.exercise8;

import java.math.BigDecimal;
import java.math.MathContext;

public class SavingsAccount {
    private BigDecimal annualInterestRate;
    private BigDecimal balance;

    public SavingsAccount(BigDecimal annualInterestRate, BigDecimal balance) {
        this.annualInterestRate = annualInterestRate;
        this.balance = balance;
    }

    public void depositMoney(BigDecimal amount) {
        this.balance = this.balance.add(amount);
    }

    public void withdrawMoney(BigDecimal amount) {
        this.balance = this.balance.subtract(amount);
    }

    public void addMonthlyInterest() {
        BigDecimal monthlyRate = this.annualInterestRate.divide(BigDecimal.valueOf(12), new MathContext(6));
        this.balance = balance.add(balance.multiply(monthlyRate));
    }

    public BigDecimal getBalance() {
        return balance;
    }
}
