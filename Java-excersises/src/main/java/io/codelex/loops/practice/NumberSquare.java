package io.codelex.loops.practice;

import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Min? ");
        int minNum =  scanner.nextInt();
        System.out.print("Max? ");
        int maxNum = scanner.nextInt();
        int startingValue = minNum;
        int length = maxNum - minNum + 1;

        for(int  i = 0; i < length; i++) {
            for (int  j = startingValue; j < startingValue + length; j++) {
                if (j <= maxNum ) {
                    System.out.print(j);
                } else {
                    System.out.print(j - length);
                }
            }
            startingValue++;
            System.out.print("\n");
        }
    }
}
