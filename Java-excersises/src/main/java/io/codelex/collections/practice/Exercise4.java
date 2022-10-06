package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Set<String> names = new HashSet<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            names.add(input);
        }
        System.out.print("Unique name list contains:");
        names.forEach(name -> System.out.print(" " + name));
    }
}
