package io.codelex.loops.practice;

import java.util.Scanner;

public class MultiplyByItself {

    public static void main(String[] args) {
        int i, n;

        Scanner in = new Scanner(System.in);
        System.out.print("Input the base number : ");
        i = in.nextInt();
        System.out.println("Input the exponent : ");
        n = in.nextInt();
        int sum = 1;

        for (int j = 1; j <= n; j++) {
            sum = sum * i;
        }
        System.out.println(sum);
    }

}
