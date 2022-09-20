package io.codelex.classesandobjects.practice.exercise8;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;

public class TestSavings {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("How much money is in the account? ");
        BigDecimal amount = keyboard.nextBigDecimal();
        System.out.print("Enter the annual interest rate: ");
        BigDecimal annualRate = keyboard.nextBigDecimal();
        System.out.print("How long account has been opened? ");
        int months = keyboard.nextInt();
        SavingsAccount account = new SavingsAccount(annualRate, amount);

        BigDecimal amountAddedTotal = BigDecimal.ZERO;
        BigDecimal amountWithdrawnTotal = BigDecimal.ZERO;
        for (int i = 1; i <= months; i++) {
            System.out.print("Enter amount deposited for month: " + i + ": ");
            BigDecimal amountAdded = keyboard.nextBigDecimal();
            System.out.print("Enter amount withdrawn for month: " + i + ": ");
            BigDecimal amountWithdrawn = keyboard.nextBigDecimal();
            account.depositMoney(amountAdded);
            account.withdrawMoney(amountWithdrawn);
            account.addMonthlyInterest();

            amountAddedTotal = amountAddedTotal.add(amountAdded);
            amountWithdrawnTotal = amountWithdrawnTotal.add(amountWithdrawn);
        }
        System.out.println("Total deposited: " + currencyFormat(amountAddedTotal));
        System.out.println("Total withdrawn: " + currencyFormat(amountWithdrawnTotal));
        System.out.println("Interest earned: " + currencyFormat(account.getBalance().subtract(amount).add(amountWithdrawnTotal).subtract(amountAddedTotal)));
        System.out.println("Ending balance: " + currencyFormat(account.getBalance()));

    }

    public static String currencyFormat(BigDecimal n) {
        return NumberFormat.getCurrencyInstance().format(n);
    }
}
