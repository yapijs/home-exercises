package io.codelex.dateandtime.practice;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise1 {
    static final int HOURS_WORKED_PER_WORKDAY = 8;

    //Create application in which you can enter two dates (LocalDate) and it will calculate how many hours regular
    //office employee works in that period of time. Assumptions are that employee works only in working days,
    //national holidays are ignored and he works 8h per working day.
    public static void main(String[] args) {
        LocalDate startDate = getDateInput();
        LocalDate endDate = getDateInput();

        Period period = Period.between(startDate, endDate);

        System.out.println("\nThe difference between these two days is: " +
                period.getYears() + " years," + period.getMonths() + " months and " + period.getDays() + " days");

        int workedHoursTotal = 0;
        for (LocalDate date = startDate; date.isBefore(endDate) ; date = date.plusDays(1)) {
            if (date.getDayOfWeek() != DayOfWeek.SATURDAY && date.getDayOfWeek() != DayOfWeek.SUNDAY){
                workedHoursTotal += HOURS_WORKED_PER_WORKDAY;
            }
        }
        System.out.println("Total worked between " + startDate + " and " + endDate + " is " + workedHoursTotal + " hours");
    }

    public static LocalDate getDateInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date in format YYYY-MM-DD");

        while (true) {
            String dateInput = scanner.nextLine();
            Pattern p = Pattern.compile("\\d{4}-\\d{2}-\\d{2}");
            Matcher matcher = p.matcher(dateInput);
            if (matcher.matches()) {
                return convertStringToLocalDate(dateInput);
            } else {
                System.out.println("Incorrect date format. Valid one is YYYY-MM-DD");
            }
        }
    }

    private static LocalDate convertStringToLocalDate(String dateInput) {
        return LocalDate.parse(dateInput, DateTimeFormatter.ISO_LOCAL_DATE);
    }
}
