package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise11 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("This");
        list.add("Is");
        list.add("My");
        list.add("List");
        list.add("Of");
        list.add("Ten");
        list.add("String");
        list.add("Values");
        list.add("The");
        list.add("End");

        list.add(4, "The new 5th element");

        list.set(list.size()-1, "And this is the new changed value");

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        if (list.contains("Foobar")) {
            System.out.println("This list indeed contain <Foobar>");
        } else {
            System.out.println("This list does not contain <Foobar>");
        }

        System.out.println();
        list.forEach(System.out::println);
    }

}
