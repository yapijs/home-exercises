package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class RollTwoDice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Desired sum: ");
        int desiredSum = scanner.nextInt();
        while (true) {
            int number1 = random.nextInt(1, 7);
            int number2 = random.nextInt(1, 7);
            int sum = number1 + number2;
            System.out.println(number1 + " and " + number2 + " = " + sum);
            if (sum == desiredSum) {
                break;
            }
        }
    }
}
