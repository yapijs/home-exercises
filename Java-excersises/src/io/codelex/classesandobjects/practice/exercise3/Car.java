package io.codelex.classesandobjects.practice.exercise3;

public class Car {
    public static void main(String[] args) {

        Odometer odometer = new Odometer(200000);
        FuelGauge fuelGauge = new FuelGauge(5);


        fuelGauge.fillGasTank(20);
        System.out.println("Just got a new car. Total mileage " + odometer.getCurrentMileage());
        System.out.println("Just filled the gas tank. Total amount of fuel is " + fuelGauge.getFuelAmount() + " litres");
        System.out.println("Driving now ...");
        while (fuelGauge.getFuelAmount() > 0 ) {
            odometer.carIsMoving(fuelGauge);
        }
        System.out.println("Just run out of gas. Fuel gauge shows " + fuelGauge.getFuelAmount() + " litres");
        System.out.println("Total mileage " + odometer.getCurrentMileage());
        int amountOfGasToFill = 80;
        fuelGauge.fillGasTank(amountOfGasToFill);
        System.out.println("Just filled gas tank by " + amountOfGasToFill + " litres.");
        System.out.println("But fuel gauge shows " + fuelGauge.getFuelAmount() + " litres");
        System.out.println("Driving now ...");
        int kmToDrive = 499;
        for (int i = 0; i < kmToDrive; i++) {
            odometer.carIsMoving(fuelGauge);
        }
        System.out.println("Just did " + kmToDrive + " km");
        System.out.println("Fuel gauge shows " + fuelGauge.getFuelAmount() + " litres left");
        System.out.println("Odometer shows " + odometer.getCurrentMileage() + " km");
    }
}
