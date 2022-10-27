package io.codelex.oop.runners;

import java.time.LocalTime;

public class RunnerTest {
    public static void main(String[] args) {
        Runner runner = Runner.BEGINNER;
        System.out.println(Runner.getFitnessLevel(LocalTime.of(5,39,0)));
        System.out.println(Runner.getFitnessLevel(LocalTime.of(2,15,0)));
        System.out.println(Runner.getFitnessLevel(LocalTime.of(2,59,59)));
        System.out.println(Runner.getFitnessLevel(LocalTime.of(3,0,0)));
        System.out.println(Runner.getFitnessLevel(LocalTime.of(3,0,1)));
    }
}
