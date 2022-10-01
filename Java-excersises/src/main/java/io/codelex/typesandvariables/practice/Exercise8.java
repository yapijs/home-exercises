package io.codelex.typesandvariables.practice;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise8 {
    //Write a Java program to convert minutes into a number of years and days.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minutes = scanner.nextInt();

        final DecimalFormat df = new DecimalFormat("0.00");

        int days = minutes/60/24;
        int years = minutes/60/24/365;
        int minutesLeft = minutes - years*365*24*60;
        int daysLeft = minutesLeft/60/24;

        String yearsString = "";
        if (years == 1 ) {
            yearsString = years + " year and ";
        } else  {
            yearsString = years + " years and ";
        }

        String daysString = "";
        if (daysLeft == 1) {
            daysString = daysLeft + " day.";
        } else  {
            daysString = daysLeft + " days.";
        }

        System.out.println(minutes + " minutes is " + yearsString + daysString);
    }
}
