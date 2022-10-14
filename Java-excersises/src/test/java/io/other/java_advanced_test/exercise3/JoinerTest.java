package io.other.java_advanced_test.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class JoinerTest {

    @Test
    void testStringConversionToString() {
        List<String> list = new ArrayList<>();
        list.add("I");
        list.add("enjoy");
        list.add("writing");
        list.add("tests");
        list.add("better");
        list.add("than");
        list.add("testing");
        list.add("manually");

        Joiner<String> joiner = new Joiner<>("_");
        joiner.joiner(list);

        Assertions.assertEquals("I_enjoy_writing_tests_better_than_testing_manually",joiner.toString());
    }


    @Test
    void testIntegerConversionToString() {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(0);

        Joiner<Integer> joiner = new Joiner<>("!");
        joiner.joiner(list);

        Assertions.assertEquals("2!5!0",joiner.toString());
    }

}
