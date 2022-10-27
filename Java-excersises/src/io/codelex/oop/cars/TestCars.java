package io.codelex.oop.cars;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static io.codelex.oop.cars.Operator.*;

public class TestCars {
    public static void main(String[] args) {
        Manufacturer manufacturer1 = new Manufacturer("Fiat Group", 1899, "Italy");
        Manufacturer manufacturer2 = new Manufacturer("Chrysler Automotive Group", 1930, "USA");
        Manufacturer manufacturer3 = new Manufacturer("Noname", 1925, "China");

        Car car1 = new Car("Fiat", "500S", BigDecimal.valueOf(12000), 2020, Arrays.asList(manufacturer1, manufacturer2, manufacturer3), EngineType.S4);
        Car car2 = new Car("Jeep", "Grand Cherokee", BigDecimal.valueOf(59990), 2022, List.of(manufacturer2, manufacturer1), EngineType.V6);
        Car car3 = new Car("Ferrari ", "512 TR", BigDecimal.valueOf(159990), 1991, List.of(manufacturer2, manufacturer3), EngineType.V12);
        Car car4 = new Car("Mercedes ", "AMG SL65", BigDecimal.valueOf(70990), 2022, List.of(manufacturer1), EngineType.V12);

        CarService service = new CarService();
        service.addCar(car1);
        service.addCar(car2);
        service.listCars();
        System.out.println("===================");
        service.removeCar(car1);
        service.listCars();
        System.out.println("===================");
        service.addCar(car1);
        service.listCars();
        System.out.println("===================");
        service.addCar(car3);
        service.addCar(car4);
        System.out.println(service.listCarsV12());
        System.out.println("===================");
        System.out.println(service.listCarsBefore1999());
        System.out.println("===================");
        System.out.println("Most expensive is " + service.mostExpensive());
        System.out.println("Least expensive is " + service.leastExpensive());
        System.out.println("===================");
        System.out.println("at least 3 manufacturers: " + service.carWith3Manufacturers());
        System.out.println("===================");
        System.out.println("at least 3 manufacturers: " + service.carWith3Manufacturers());
        System.out.println("===================");
        System.out.println("Sorted asc");
        System.out.println(service.sortedBy("ascending"));
        System.out.println("Sorted desc");
        System.out.println(service.sortedBy("descending"));
        System.out.println("===================");
        System.out.println("Fiat 500 found? " + service.findCar("Fiat 500"));
        System.out.println("Fiat 500s found? " + service.findCar("Fiat 500s"));
        System.out.println("Fiat 500S found? " + service.findCar("Fiat 500S"));
        System.out.println("===================");
        System.out.println("Cars with Noname manufacturer " + service.getListOfCarsByManufacturer("Noname"));
        System.out.println("Cars with Chrysler Automotive Group manufacturer " + service.getListOfCarsByManufacturer("Chrysler Automotive Group"));
        System.out.println("===================");
        System.out.println(service.getListOfCarsByManufacturerCompareWithYear(LESS_THAN,1900));
        System.out.println(service.getListOfCarsByManufacturerCompareWithYear(GREATER_THAN,1900));
        System.out.println(service.getListOfCarsByManufacturerCompareWithYear(EQUALS,1925));
        System.out.println(service.getListOfCarsByManufacturerCompareWithYear(NOT_EQUALS,1925));
    }
}
