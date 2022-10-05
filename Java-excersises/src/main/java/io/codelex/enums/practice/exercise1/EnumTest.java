package io.codelex.enums.practice.exercise1;

import java.sql.SQLOutput;

public class EnumTest {
    public static void main(String[] args) {
        for (Directions dir: Directions.values()) {
            System.out.println(dir + ":" + dir.getDirection() + ":"+ dir.ordinal());
        }
    }
}
