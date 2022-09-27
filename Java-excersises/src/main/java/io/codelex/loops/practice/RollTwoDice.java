package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;

public class RollTwoDice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Desired sum: ");
        int desiredSum = scanner.nextInt();
        while (true) {
            int number1 = rollDice();
            int number2 = rollDice();
            int sum = number1 + number2;
            System.out.println(number1 + " and " + number2 + " = " + sum);
            if (sum == desiredSum) {
                break;
            }
        }
    }

    public static int rollDice() {
        return new Random().nextInt(1, 7);
    }

}
