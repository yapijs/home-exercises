package io.codelex.arithmetic.practice;

public class Product1ToN {
    public static void main(String[] args) {
        //Write a program called Product1ToN to compute the product of integers from 1 to 10 (i.e., 1×2×3×...×10), as an int.
        // Take a note that it is the same as factorial of N.

        int sum = 1;
        int n = 10;
        for (int i=1; i <= n; i++) {
            sum *= i;
        }
        System.out.println("Factorial of N is " + sum);
    }
}
