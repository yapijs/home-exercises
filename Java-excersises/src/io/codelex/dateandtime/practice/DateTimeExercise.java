package io.codelex.dateandtime.practice;

import java.time.LocalDate;

public class DateTimeExercise {
    public static final long DAYS_BETWEEN = 5;

    public static LocalDate createNewYearsEve2017() {
        return LocalDate.of(2017, 12, 31);
    }

    public static LocalDate[] getTwoLocalDates() {
        LocalDate[] dates = new LocalDate[2];
        dates[0] = LocalDate.now();
        dates[1] = dates[0].plusDays(DAYS_BETWEEN);
        return dates;
    }

    public static LocalDate findNextFriday13th(LocalDate from) {
        while (true) {
            if (from.getDayOfWeek().getValue() == 5  && from.getDayOfMonth() == 13) {
                return from;
            }
            from = from.plusDays(1);
        }
    }
}
