package io.codelex.arrays.practice;

public class Exercise5 {

    public static void main(String[] args) {
        int[] myArray = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        int indexOfElement36 = getIndexOfElement(36, myArray);
        int indexOfElement29 = getIndexOfElement(29, myArray);

        //Expected output:
        //Index position of 36 is: 4
        //Index position of 29 is: 8

        System.out.println("Index position of 36 is: " + indexOfElement36);
        System.out.println("Index position of 29 is: " + indexOfElement29);
    }

    static int getIndexOfElement(int valueToFind, int[] array) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valueToFind) {
                index = i;
            }
        }
        return index;
    }
}
