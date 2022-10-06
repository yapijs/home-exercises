package io.codelex.collections.practice;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numberInitial = scanner.nextLine();
        String number = numberInitial;
        String currentValue = "";
        String prevValue = "";

        while (true) {
            int sum = 0;
            for (int i = 0; i < number.length(); i++) {
                int value = Character.getNumericValue(number.charAt(i));
                sum += Math.pow(value, 2);
            }

            number = String.valueOf(sum);
            currentValue = number;
            if (number.equals("1")) {
                System.out.println("This is happy number");
                break;
            }
            if (currentValue.equals(numberInitial)) {
                System.out.println("Endless loop");
                break;
            }
            if (currentValue.equals(prevValue) && !prevValue.equals("")) {
                System.out.println("Number repeats");
                break;
            }
            prevValue = currentValue;
        }
    }
}
