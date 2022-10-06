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
        String menu = validateInput(true);
        if (menu.equals("1")) {
            System.out.println("Select number of starting city");

            String newStartLocation = getNewCity(null, route);
            initialStartingPoint = newStartLocation;

            while(true) {
                System.out.println("\nYou would be in " + newStartLocation);
                System.out.println("Select the next destination");

                newStartLocation = getNewCity(newStartLocation, route);
                if (newStartLocation.equals(initialStartingPoint)) {
                    break;
                }
            }

            printRoute(route);
        }
    }

    private static String getNewCity(String start, List<String> route) {
        List<String> possibleDestinationsList = returnListOfCities(start);
        printListOfAvailableCities(possibleDestinationsList);

        int index = convertIndex(validateInput(false));
        String city = possibleDestinationsList.get(index);
        route.add(city);
        return city;
    }

    private static String validateInput(boolean isAtStart) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String in = scanner.nextLine();

            if (isAtStart) {
                if (in.equals("#")) {
                    return in;
                }
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
    private static void printListOfAvailableCities(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + 1 + ". " + list.get(i));
        }
    }
}
