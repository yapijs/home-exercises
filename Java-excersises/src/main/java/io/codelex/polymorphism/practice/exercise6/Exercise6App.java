package io.codelex.polymorphism.practice.exercise6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise6App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Animal> animals = new ArrayList<>();

        loop:
        {
            while (true) {
                System.out.println("\nEnter animal parameters: ");
                String input = scanner.nextLine();
                String[] values = input.split(" ");
                Animal newAnimal = null;

                if (values[0].toLowerCase().equals("end")) {
                    break;
                } else {
                    switch (values[0].toLowerCase()) {
                        case "mouse" -> newAnimal = new Mouse(values[0], values[1], Double.valueOf(values[2]), values[3]);
                        case "zebra" -> newAnimal = new Zebra(values[0], values[1], Double.valueOf(values[2]), values[3]);
                        case "tiger" -> newAnimal = new Tiger(values[0], values[1], Double.valueOf(values[2]), values[3]);
                        case "cat" -> newAnimal = new Cat(values[0], values[1], Double.valueOf(values[2]), values[3], values[4]);

                    }
                }
                System.out.println("\nEnter animal food: ");
                input = scanner.nextLine();
                values = input.split(" ");
                if (values[0].toLowerCase().equals("end")) {
                    break;
                } else {
                    if (newAnimal != null){
                        if (values[0].toLowerCase().contains("meat")) {
                            newAnimal.eatFood(new Meat(Integer.valueOf(values[1])));
                        } else if (values[0].toLowerCase().contains("vegetable")) {
                            newAnimal.eatFood(new Vegetable(Integer.valueOf(values[1])));
                        }
                    }
                }
                animals.add(newAnimal);
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < animals.size(); i++) {
                sb.append(animals.get(i).toString());
                if (i != animals.size() - 1) {
                    sb.append(", ");
                }
            }
            System.out.println(sb.toString());
        }
    }
}
