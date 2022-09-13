package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class PhoneKeyPad {
    //On your phone keypad, the alphabets are mapped to digits as follows: ABC(2), DEF(3), GHI(4), JKL(5), MNO(6), PQRS(7), TUV(8), WXYZ(9).
    //Write a program called PhoneKeyPad, which prompts user for a String (case insensitive), and converts to a sequence of keypad digits.
//    Hints
//
//    You can use in.next().toLowerCase() to read a String and convert it to lowercase to reduce your cases.
//    In switch-case, you can handle multiple cases by omitting the break statement, e.g.,
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text from phone key pad:");
        String inputString = scanner.nextLine();
        StringBuilder digits = new StringBuilder();
        char[] charArray = inputString.toLowerCase().toCharArray();

        for (char letter: charArray){
            switch (letter) {
                case 'a', 'b', 'c' -> digits.append("2");
                case 'd', 'e', 'f' -> digits.append("3");
                case 'g', 'h', 'i' -> digits.append("4");
                case 'j', 'k', 'l' -> digits.append("5");
                case 'm', 'n', 'o' -> digits.append("6");
                case 'p', 'q', 'r', 's' -> digits.append("7");
                case 't', 'u', 'v' -> digits.append("8");
                case 'w', 'x', 'y', 'z' -> digits.append("9");
                case ' ', '+' -> digits.append("0");
                default -> {
                }
            }
        }
        System.out.println("The matching number is " + digits);
    }
}
