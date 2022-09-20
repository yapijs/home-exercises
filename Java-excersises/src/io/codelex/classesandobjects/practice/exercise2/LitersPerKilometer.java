package io.codelex.classesandobjects.practice.exercise2;

import java.util.Scanner;

class LitersPerKilometer {
    static double startKilometers;
    static double endKilometers;
    static double liters;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        //Start of the task
//
//        System.out.println("Data for 1st car:");
//        enterData();
//        Car car1 = new Car(startKilometers, endKilometers, liters);
//
//        System.out.println( "Kilometers per liter are "  + car1.calculateConsumption() );
//        isEconomicPrintResult(car1);
//
//
//        System.out.println("Data for 2st car:");
//        enterData();
//        Car car2 = new Car(startKilometers, endKilometers, liters);
//
//        System.out.println( "Kilometers per liter are "  + car2.calculateConsumption() );
//        isEconomicPrintResult(car2);


        //final
        System.out.println("Data for 1st car:");
        System.out.print("Enter start reading: ");
        Car car1 = new Car(scan.nextDouble());

        System.out.println("What is the current mileage: ");
        int mileage = scan.nextInt();
        System.out.println("How many liters of gas did you filled up in the tank: ");
        liters = scan.nextDouble();
        car1.fillUp(mileage, liters);
        System.out.println("Liters per 100km: " + car1.calculateConsumption());
        isEconomicPrintResult(car1);

        System.out.println("What is the current mileage now: ");
        mileage = scan.nextInt();
        System.out.println("How many liters of gas did you filled up in the tank: ");
        liters = scan.nextDouble();
        car1.fillUp(mileage, liters);
        System.out.println("Liters per 100km: " + car1.calculateConsumption());
        isEconomicPrintResult(car1);
    }

//    static void enterData() {
//        System.out.print("Enter start reading: ");
//        startKilometers = scan.nextDouble();
//
//        System.out.print("Enter second reading: ");
//        endKilometers = scan.nextDouble();
//
//        System.out.print("Enter liters consumed: ");
//        liters = scan.nextDouble();
//    }

    static void isEconomicPrintResult(Car car) {
        if (car.isGasHog()) {
            System.out.println("This is a gas hog!");
        } else if (car.isEconomyCar()) {
            System.out.println("This is very economic car!");
        }
    }
}