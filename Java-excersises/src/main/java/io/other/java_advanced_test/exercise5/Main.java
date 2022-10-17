package io.other.java_advanced_test.exercise5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*## Exercise #5
#### (generics + functional programming)
Implement the generic partOf method, which will return % of items satisfying the condition based on any type of list and the function indicated as parameter.
*/

public class Main {
    public static void main(String[] args) {


        List<String> names = Arrays.asList("John", "Peter", "Angelina", "Bravo");
        double percent = partOf(names, (String name) -> name.length() > 4);
        System.out.println(percent); //Should print out 0.75 because 75% of names are longer than 4 letters

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        double evenPercent = partOf(numbers, (Integer n) -> n % 2 == 1);
        System.out.println(evenPercent); //Should print out 0.5 because 50% of numbers are even
    }

    public static <T> double partOf(List<T> list, Predicate<T> function) {
        long count = list.stream().filter(function).count();
        return (double) count / list.size();
    };
}
