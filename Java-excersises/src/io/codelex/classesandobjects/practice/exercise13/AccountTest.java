package io.codelex.classesandobjects.practice.exercise13;

public class AccountTest {
    public static void main(String[] args) {
        Account bartosAccount = new Account("Barto's account",100.00);
        Account bartosSwissAccount = new Account("Barto's account in Switzerland",1000000.00);

        System.out.println("Initial state");
        System.out.println(bartosAccount);
        System.out.println(bartosSwissAccount);

        bartosAccount.withdrawal(20);
        System.out.println("Barto's account balance is now: "+bartosAccount.balance());
        bartosSwissAccount.deposit(200);
        System.out.println("Barto's Swiss account balance is now: "+bartosSwissAccount.balance());

        System.out.println("Final state");
        System.out.println(bartosAccount);
        System.out.println(bartosSwissAccount);

        System.out.println("=============================================");
        Account newAccount = new Account("Davis' account",100.00);
        System.out.println(newAccount);
        newAccount.deposit(20);
        System.out.println("Final state");
        System.out.println(newAccount);

        System.out.println("=============================================");
        Account mattsAccount = new Account("Matt's account",1000.00);
        Account myAccount = new Account("My account",0.00);
        mattsAccount.withdrawal(20);
        myAccount.deposit(20);
        System.out.println(mattsAccount);
        System.out.println(myAccount);

        System.out.println("=============================================");
        Account aAccount = new Account("A",100.00);
        Account bAccount = new Account("B",0.00);
        Account cAccount = new Account("C",0.00);
        transfer(aAccount, bAccount, 50);
        transfer(bAccount, cAccount, 25);
        System.out.println(aAccount);
        System.out.println(bAccount);
        System.out.println(cAccount);


    }

    public static void transfer(Account from, Account to, double howMuch) {
        if (from != null && to != null) {
            from.withdrawal(howMuch);
            to.deposit(howMuch);
        }
    }
}
