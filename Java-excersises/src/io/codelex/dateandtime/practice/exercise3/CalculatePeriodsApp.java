package io.codelex.dateandtime.practice.exercise3;

import java.time.LocalDate;

public class CalculatePeriodsApp {
    public static void main(String[] args) {
        LocalDate firstStart = LocalDate.of(2022, 1, 10);
        LocalDate firstEnd = LocalDate.of(2022, 1, 16);
        DatePeriod firstPeriod = new DatePeriod(firstStart, firstEnd);

        LocalDate secondStart = LocalDate.of(2022, 1, 1);
        LocalDate secondEnd = LocalDate.of(2022, 1, 6);
        DatePeriod secondPeriod = new DatePeriod(secondStart, secondEnd);

        DatePeriod overlap = firstPeriod.intersection(secondPeriod);
        if (overlap != null) {
            System.out.println("Overlap start date is " + overlap.getStart() + " and end date is " + overlap.getEnd());
        } else {
            System.out.println("There is no overlap");
        }
    }
}
