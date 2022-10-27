package io.codelex.arrays.practice;

import java.util.Arrays;
import java.util.Random;

public class Exercise6 {
    public static void main(String[] args) {

        int[] array1 = new int[10];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = new Random().nextInt(101);
        }

        int[] array2 = Arrays.copyOf(array1, array1.length);
        array1[9] = -7;

        System.out.println("Array 1:");
        printArray(array1);
        System.out.println("Array 2:");
        printArray(array2);
    }

    static void printArray(int[] arrayToPrint) {
        for (int i: arrayToPrint) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }
}
