package io.codelex.arrays.practice;

import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {

        Integer[] myArray1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456
        };

        String[] myArray2 = {
                "Java",
                "Python",
                "PHP",
                "C#",
                "C Programming",
                "C++"
        };



        printIntArray("Original numeric array   : ", myArray1);
        Arrays.sort(myArray1);
        printIntArray("Sorted numeric array     : ", myArray1);

        printIntArray("Original string array   : ", myArray2);
        Arrays.sort(myArray2);
        printIntArray("Sorted string array     : ", myArray2);
    }

    public static void printIntArray(String message, Object[] array) {
        System.out.print("\n" + message);
        for (Object num : array) {
            System.out.print(num + " ");
        }
    }
}
