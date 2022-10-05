package io.codelex.exceptions.practice;

import java.util.Arrays;

public class Exercise2 {
    static int a = 2;
    static int b = 0;

    public static void main(String[] args) {

        methodA();
    }

        public static void methodA() throws ArithmeticException  {
        try {
            methodB();
            } catch (ArithmeticException e) {
                e.printStackTrace();
                throw new ArithmeticException("methodA");
            }
        }

        public static void methodB() throws ArithmeticException {
            try {
                methodC();
            } catch (ArithmeticException e) {
                e.printStackTrace();
                throw new ArithmeticException("methodB");
            }
        }

        public static void methodC() throws ArithmeticException {
            try {
                System.out.println(a / b);
            } catch (ArithmeticException e) {
                e.printStackTrace();
                throw new ArithmeticException("methodC");
            }
        }

}
