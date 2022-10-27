package io.codelex.classesandobjects.practice.exercise5;

import java.util.Scanner;

public class DateApp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter month:");
        int month = keyboard.nextInt();
        System.out.println("Enter day:");
        int day = keyboard.nextInt();
        System.out.println("Enter year:");
        int year = keyboard.nextInt();
        Date date = new Date(month, day, year);
        System.out.println("You just entered:" + date.displayDate());

        Date date1 = new Date(month, day, year);
        System.out.println("Creating new Date instance...");
        System.out.println(date1.displayDate());
        System.out.println("Are both dates the same? " + date1.equals(date));

        System.out.println("Change day");
        date1.setDay(keyboard.nextInt());
        System.out.println("Change month");
        date1.setDay(keyboard.nextInt());
        System.out.println("Change year");
        date1.setYear(keyboard.nextInt());
        System.out.println("You changed this one: " + date1.displayDate());
        System.out.println("Other one: " + date.displayDate());
        System.out.println("Are both dates the same? " + date1.equals(date));
    }
}
