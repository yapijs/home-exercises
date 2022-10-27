package io.codelex.oop.cars;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CarService {
    public List<Car> cars;

    public CarService() {
        cars = new ArrayList<>();
    }

    public void addCar(Car newCar) {
        if (findCar(newCar) == null) {
            cars.add(newCar);
        } else {
            System.out.println("Such car already exists");
        }
    }

    public void removeCar(Car newCar) {
        if (findCar(newCar) != null) {
            cars.remove(newCar);
        } else {
            System.out.println("No such car");
        }
    }

    private Car findCar(Car carToFind) {
        return cars.stream()
                .filter(car -> car.equals(carToFind))
                .findFirst()
                .orElse(null);
    }

    public void listCars() {
        cars.forEach(System.out::println);
    }

    public List<Car> listCarsV12() {
        return cars.stream().filter(car -> car.getEngine() == EngineType.V12).toList();
    }

    public List<Car> listCarsBefore1999() {
        return cars.stream().filter(car -> car.getYear() < 1999).toList();
    }

    public Car mostExpensive() {
        return cars.stream()
                .max(Comparator.comparing(Car::getPrice))
                .orElse(null);
    }

    public Car leastExpensive() {
        return cars.stream()
                .min(Comparator.comparing(Car::getPrice))
                .orElse(null);
    }

    public Car carWith3Manufacturers() {
        return cars.stream()
                .filter(car -> car.getManufacturers().size() >= 3)
                .findFirst()
                .orElse(null);
    }

    public List<Car> sortedBy(String sortOrder) {
        if (sortOrder.equals("ascending")) {
            return cars.stream()
                    .sorted(Comparator.comparing(Car::getName))
                    .toList();
        } else if (sortOrder.equals("descending")) {
            return cars.stream()
                    .sorted((car2, car1) -> car1
                            .getName()
                            .compareTo(car2.getName()))
                    .toList();
        } else {
            System.out.println("Wrong parameter");
            return null;
        }
    }
    public boolean findCar(String name) {
        for (Car car: cars) {
            if ((car.getName() + " " + car.getModel()).equals(name)) {
                return true;
            }
        }
        return false;
    }

    public List<Car> getListOfCarsByManufacturer(String manufacturerName) {
        List<Car> carList = new ArrayList<>();
        for (Car car: cars) {
            boolean manufacturerFound = car.getManufacturers().stream()
                    .anyMatch(manufacturer -> manufacturer
                            .getName()
                            .equals(manufacturerName));
            if (manufacturerFound) {
                carList.add(car);
            }
        }
        return carList;
    }

    public List<Car> getListOfCarsByManufacturerCompareWithYear(Operator operator, int year) {
        List<Car> result = new ArrayList<>();
        for (Car car: cars) {
            if (operator == Operator.NOT_EQUALS)  {
                if (car.getManufacturers().stream()
                        .allMatch(manufacturer -> operator.compareYear(manufacturer, year))) {
                    result.add(car);
                }
            } else {
                if (car.getManufacturers().stream()
                        .anyMatch(manufacturer -> operator.compareYear(manufacturer, year))) {
                    result.add(car);
                }
            }
        }
        return result;
    }

}
