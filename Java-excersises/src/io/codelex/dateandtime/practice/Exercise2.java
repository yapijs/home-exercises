package io.codelex.dateandtime.practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise2 {
//Server update must be performed every two weeks (14 days). Given a date when server is launched create a method
//that calculates at which dates server must be updated in given month. For example if server is launched on 02.02.2022
// it must be updated on 16th of February, then on 2nd of March.
//
//So if user inputs server launch date (for ex. 01.06.2022), year (for ex. 2022) and month (for ex. September),
// then application should return at which dates server must be updated in September 2022.

    public static void main(String[] args) {
        String inputMessage = "";

        inputMessage = "Enter installation date of server in format YYYY-MM-DD";
        LocalDate installDate = getDateInput("\\d{4}-\\d{2}-\\d{2}", inputMessage);

        inputMessage = "Select a month and year of interest, where updates should be performed, in format YYYY-MM";
        LocalDate updateMonth = getDateInput("\\d{4}-\\d{2}", inputMessage);
        updateMonth = updateMonth.plusDays(updateMonth.lengthOfMonth()-1);


        //calculate Days
        for (LocalDate date = installDate; date.isBefore(updateMonth) ; date = date.plusDays(14)) {
            if (date.getMonthValue() == updateMonth.getMonthValue()) {
                System.out.println("Server update must be done on " + date.toString());
            }
        }

    }

    public static LocalDate getDateInput(String regex, String inputMessage) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(inputMessage);
            String dateInput = scanner.nextLine();
            Pattern p = Pattern.compile(regex);
            Matcher matcher = p.matcher(dateInput);
            if (matcher.matches()) {
                return convertStringToLocalDate(dateInput);
            } else {
                System.out.println("Incorrect date format. Try again");
            }
        }
    }

    private static LocalDate convertStringToLocalDate(String dateInput) {
        Pattern p = Pattern.compile("\\d{4}-\\d{2}");
        Matcher matcher = p.matcher(dateInput);
        if (matcher.matches()) {
            dateInput += "-01";
        }
        return LocalDate.parse(dateInput, DateTimeFormatter.ISO_LOCAL_DATE);
    }


}
