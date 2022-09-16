package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the 1st number: ");
        int num1 = in.nextInt();

        System.out.print("Input the 2nd number: ");
        int num2 = in.nextInt();

        System.out.print("Input the 3rd number: ");
        int num3 = in.nextInt();

        int largestNumber = num1 >= num2 ? num1 : num2;
        largestNumber = largestNumber >= num3 ? largestNumber : num3;

        System.out.println("The largest number is " + largestNumber);
    }

}
