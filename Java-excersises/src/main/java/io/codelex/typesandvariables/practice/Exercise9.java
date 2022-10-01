package io.codelex.typesandvariables.practice;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
//        Write a Java program to takes the user for a distance (in meters) and the time was taken (as three numbers: hours, minutes, seconds),
//        and display the speed, in meters per second, kilometers per hour and miles per hour (hint: 1 mile = 1609 meters).
//
//        Test Data
//        Input distance in meters: 2500
//        Input hour: 5
//        Input minutes: 56
//        Input seconds: 23
//        Expected Output :
//        Your speed in meters/second is 0.11691531
//        Your speed in km/h is 0.42089513
//        Your speed in miles/h is 0.26158801

//        int distance = 2500;
//        int timeHours = 5;
//        int timeMinutes = 56;
//        int timeSeconds = 23;
        final DecimalFormat df = new DecimalFormat("0.00000000");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input distance in meters: ");
        int distance = scanner.nextInt();
        System.out.println("Input hours: ");
        int timeHours = scanner.nextInt();
        System.out.println("Input minutes: ");
        int timeMinutes = scanner.nextInt();
        System.out.println("Input seconds: ");
        int timeSeconds = scanner.nextInt();

        //m/s calculation
        int totalTimeSeconds = (timeHours*60 + timeMinutes)*60 + timeSeconds;
        double speed1 = (double) distance/totalTimeSeconds;
        System.out.println("Your speed in meters/second is " + df.format(speed1));

        //kmh calculation
        double totalDistanceKm = (double) distance/ 1000;
        double totalTimeHours = timeHours + ((double) timeSeconds / 60 + timeMinutes) / 60;
        double speed2 = totalDistanceKm/totalTimeHours;
        System.out.println("Your speed in kilometers/hour is " + df.format(speed2));

        //mph calculation
        double totalDistanceM = (double) distance/ 1609;
        double speed3 = totalDistanceM/totalTimeHours;
        System.out.println("Your speed in miles/hour is " + df.format(speed3));
    }
}
