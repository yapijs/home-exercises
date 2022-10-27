package io.codelex.polymorphism.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

/**
 * Take a look at the cars in this package.
 * 1. Extract common behaviour to an interface called Car, and use it in the all classes.
 * Which methods will be extracted with an empty body, and which can be default?
 * 2. Create two more cars of your own choice.
 * 3. As you see there is a possibility to use some kind of boost in Lexus, extract it to a new interface and add that behaviour in one more car.
 * 3. Create one instance of an each car and add them to list.
 * 4. Iterate over the list 10 times, in the 3rd iteration use speed boost on the car if they have one.
 * 5. Print out the car name and speed of the fastest car
 */
public class DragRace {

    public static void main(String[] args) {
        Car audi = new Audi("Audi");
        Car bmw = new Bmw("BMW");
        Car jaguar = new Jaguar("Jaguar");
        Car lexus = new Lexus("Lexus");
        Car tesla = new Tesla("Tesla");
        Car volvo = new Volvo("Volvo");
        Car lexus3 = new Lexus("Lexus without Nitro");
        Jaguar jaguar2 = new Jaguar("Jaguar with Nitro");
        Lexus lexus2 = new Lexus("Lexus with Nitro");

        List<Car> cars = new ArrayList<>();
        cars.add(audi);
        cars.add(bmw);
        cars.add(jaguar);
        cars.add(lexus);
        cars.add(tesla);
        cars.add(lexus3);
        cars.add(lexus2);
        cars.add(volvo);
        cars.add(jaguar2);

        List<NitrousOxideEngine> carsWithNitro = new ArrayList<>();
        carsWithNitro.add(lexus2);
        carsWithNitro.add(jaguar2);
        carsWithNitro.add((NitrousOxideEngine) jaguar);
        carsWithNitro.add((NitrousOxideEngine) lexus);


        Car carWithMaxSpeed = null;
        for (int i = 0; i < 11; i++) {
            if (i != 2) {
                for (int j = 0; j < cars.size(); j++) {
                    if (i == 0) {
                        System.out.print(cars.get(j).getName() + " starts engine ");
                        cars.get(j).startEngine();
                    } else if (i < 10) {
                        cars.get(j).speedUp();
                    } else {
                        System.out.println(cars.get(j).getName() + " has reached " + cars.get(j).showCurrentSpeed() + " kph");
                        if (carWithMaxSpeed == null) {
                            carWithMaxSpeed = cars.get(j);
                        } else if (carWithMaxSpeed.showCurrentSpeed() < cars.get(j).showCurrentSpeed()) {
                            carWithMaxSpeed = cars.get(j);
                        }
                    }
                }
            } else {
                for (NitrousOxideEngine car: carsWithNitro) {
                    car.useNitrousOxideEngine();
                }
            }
        }

        System.out.println("Car with max speed is " + carWithMaxSpeed.getName() + " with speed: " + carWithMaxSpeed.showCurrentSpeed() );
    }
}
