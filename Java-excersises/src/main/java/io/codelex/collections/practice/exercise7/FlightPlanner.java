package io.codelex.collections.practice.exercise7;

import io.codelex.collections.practice.Histogram;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FlightPlanner {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/flights.txt";
    private static List<Flight> allFlights = new ArrayList<>();

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        List<String> rawFlights = Files.readAllLines(path, charset);
        for (String rawFlight: rawFlights) {
            String[] flightArray = rawFlight.split(" -> ");
            allFlights.add(new Flight(flightArray[0], flightArray[1]));
        }

        List<String> route = new ArrayList<>();
        String initialStartingPoint = "";

        System.out.println("What would you like to do:");
        System.out.println("To display list of cities press 1");
        String input = validateInput();
        if (input.equals("1")) {
            System.out.println("Select number of starting city");

            List<String> possibleDestinationsList = returnListOfCities(null);
            printListOfAvailableCities(possibleDestinationsList);

            int index = convertIndex(validateInput());
            route.add(possibleDestinationsList.get(index));
            String newStartLocation = route.get(route.size()-1);
            initialStartingPoint = newStartLocation;
            System.out.println(route);
            while(true) {
                System.out.println("\nYou would be in " + newStartLocation);
                System.out.println("Select the next destination");

                possibleDestinationsList = returnListOfCities(newStartLocation);
                printListOfAvailableCities(possibleDestinationsList);

                index = convertIndex(validateInput());
                String newDestination = possibleDestinationsList.get(index);
                route.add(newDestination);
                newStartLocation = newDestination;

                if (newDestination.equals(initialStartingPoint)) {
                    break;
                }
            }

            printRoute(route);
        }
    }

    private static String validateInput() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String in = scanner.nextLine();
            if (in.equals("#")) {
                return in;
            }
            Pattern p = Pattern.compile("^\\d+$");
            Matcher m = p.matcher(in);
            if (m.find()) {
                return in;
            } else {
                System.out.println("Try again!");
            }
        }
    }

    private static int convertIndex(String input) {
        return Integer.parseInt(input) - 1;
    }

    private static void printRoute(List<String> route) {
        for (int i = 0; i < route.size(); i++) {
            System.out.print(route.get(i));
            if (i != route.size()-1) {
                System.out.print(" -> ");
            }
        }
    }

    private static List<String> returnListOfCities(String start) {
        List<String> cities = new ArrayList<>();
        if (start == null) {
            for(Flight f : allFlights) {
                if (!cities.contains(f.getStart())) {
                    cities.add(f.getStart());
                }
            }
        } else {
            for(Flight f : allFlights) {
                if (start.equals(f.getStart()) && !cities.contains(f.getEnd())) {
                    cities.add(f.getEnd());
                }
            }
        }
        return cities;
    }

    //private static String returnNewDestination(List<String> )

    private static void printListOfAvailableCities(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + 1 + ". " + list.get(i));
        }
    }

//    private static void selectNextDestination() {
//
//    }
//
//    private static void addNextDestination(int i, List<String> availableLocations, List<String> destinations) {
//        destinations.add(availableLocations.get(i-1));
//    }
}
