package io.codelex.collections.practice;

import java.util.*;

/**
 * Origination:
 * Audi -> Germany
 * BMW -> Germany
 * Honda -> Japan
 * Mercedes -> Germany
 * VolksWagen -> Germany
 * Tesla -> USA
 */
public class Exercise1 {
    public static void main(String[] args) {
        String[] array = {"Audi", "BMW", "Honda", "Mercedes", "VolksWagen", "Mercedes", "Tesla"};


        List<String> list = new ArrayList<>(Arrays.asList(array));
        System.out.println(list);

        Set<String> hashSet = new HashSet<>(Arrays.asList(array));
        System.out.println(hashSet);

        Map<String, String> map = new HashMap<>(Map.ofEntries(
                new AbstractMap.SimpleEntry<>("Audi", "Germany"),
                new AbstractMap.SimpleEntry<>("BMW", "Germany"),
                new AbstractMap.SimpleEntry<>("Honda", "Japan"),
                new AbstractMap.SimpleEntry<>("Mercedes", "Germany"),
                new AbstractMap.SimpleEntry<>("Volkswagen", "Germany"),
                new AbstractMap.SimpleEntry<>("Tesla", "USA")
        ));
        System.out.println(map);
    }
}
