package io.codelex.loops.practice;

import java.util.Scanner;

public class AsciiFigure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many lines in Ascii figure?");
        int lines = scanner.nextInt();

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < (lines - 1) * 4; j++) {
                if ((lines - 1 - i) * 4 > j) {
                    System.out.print("/");
                } else {
                    System.out.print("*");
                }
            }
            for (int j = (lines - 1) * 4; j > 0; j--) {
                if ((lines - 1 - i) * 4 >= j) {
                    System.out.print("\\");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
