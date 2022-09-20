package io.codelex.classesandobjects.practice.exercise10;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount benben = new BankAccount("Benson", 17.25);
        System.out.println(benben);

        BankAccount john = new BankAccount("Johnson", -200.195);
        System.out.println(john);

        BankAccount james = new BankAccount("James", 1859000);
        System.out.println(james);
    }
}
