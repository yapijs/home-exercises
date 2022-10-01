package io.codelex.arithmetic.practice;

public class CozaLozaWoza {
    public static void main(String[] args) {
//        Write a program called CozaLozaWoza which prints the numbers 1 to 110, 11 numbers per line.
//        The program shall print "Coza" in place of the numbers which are multiples of 3, "Loza" for
//        multiples of 5, "Woza" for multiples of 7, "CozaLoza" for multiples of 3 and 5, and so on.

        int currentNumber;
        for (int i=0; i < 10; i++) {
            for (int j = 1; j < 12; j++) {
                currentNumber = 11 * i + j;

                if (currentNumber % 3 == 0) {
                    System.out.print("Coza");
                }
                if (currentNumber % 5 == 0) {
                    System.out.print("Loza");
                }
                if (currentNumber % 7 == 0) {
                    System.out.print("Woza");
                }

                if (currentNumber % 3 != 0 && currentNumber % 5 != 0 && currentNumber % 7 != 0) {
                    System.out.print(currentNumber);
                }
                System.out.print(" ");

            }
            System.out.print("\n");
        }
    }
}
