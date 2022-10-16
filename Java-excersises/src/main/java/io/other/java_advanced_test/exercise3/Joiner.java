package io.other.java_advanced_test.exercise3;

import java.util.List;
import java.util.stream.Collectors;

/*Design the Joiner<T> class, which in the constructor will take a separator (string) and have a join() method
that allows you to specify any number of T-type objects. This method will return a string joining all passed elements
by calling their toString() method and separating them with a separator.
Write a test for the class.
e.g. for Integers and separator "-" it should return: 1-2-3-4 ...*/
public class Joiner<T> {
    private String seperator;

    public Joiner(String separator) {
        this.seperator = separator;
    }

    public String join(List<T> listOfElements) {
         return listOfElements.stream()
                 .map(Object::toString)
                 .collect(Collectors.joining(seperator));
    }
}
