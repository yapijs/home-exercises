package io.codelex.classesandobjects.practice.exercise10;

// Each BankAccount object represents one user's account
// information including name and balance of money.

import java.text.DecimalFormat;

public class BankAccount {
    public String name;
    public double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public final void deposit(double amount) {
        balance += amount;
    }

    public final void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("$#,###,###,##0.00");
        return name + ", " +
                df.format(balance);
    }
}
