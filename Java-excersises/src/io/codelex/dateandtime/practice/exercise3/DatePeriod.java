package io.codelex.dateandtime.practice.exercise3;

import java.time.LocalDate;

public class DatePeriod {
    private LocalDate start;
    private LocalDate end;

    public DatePeriod(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }

    public LocalDate getStart() {
        return start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public DatePeriod intersection(DatePeriod period) {
        LocalDate intersectionStart = null;
        LocalDate intersectionEnd = null;

        if (!notOverlapping(period)) {
            if (isPeriodsMatching(period)) {
                intersectionStart = period.getStart();
                intersectionEnd = period.getEnd();
            } else if (isExternalFullyIncluded(period) || isStartMatchingEndExternal(period) || isEndMatchingStartExternal(period))  {
                intersectionStart = period.getStart();
                intersectionEnd = period.getEnd();
            } else if (isLocalFullyIncluded(period) || isStartMatchingEndLocal(period) || isEndMatchingStartLocal(period)) {
                intersectionStart = this.getStart();
                intersectionEnd = this.getEnd();
            } else if (isStartExternalEndLocal(period)) {
                intersectionStart = period.getStart();
                intersectionEnd = this.getEnd();
            } else if (isStartLocalEndExternal(period)) {
                intersectionStart = this.getStart();
                intersectionEnd = period.getEnd();
            } else if (isStartMatchingEndLocal(period)) {
                intersectionStart = this.getStart();
                intersectionEnd = this.getEnd();
            } /*else {
                System.out.println("something is going on....");
            }*/
        }

        if (intersectionStart != null && intersectionEnd != null) {
            return new DatePeriod(intersectionStart, intersectionEnd);
        } else {
            return null;
        }

    }

    private boolean notOverlapping(DatePeriod period) {
        //returns true if not overlapping
        return this.getEnd().isBefore(period.getStart()) && this.getStart().isBefore(period.getStart()) ||
                period.getEnd().isBefore(this.getStart()) && period.getStart().isBefore(this.getStart());
    }

    private boolean isExternalFullyIncluded(DatePeriod period) {
        //local instance is inside external
        return this.getStart().isBefore(period.getStart()) && this.getEnd().isAfter(period.getEnd());
    }

    private boolean isLocalFullyIncluded(DatePeriod period) {
        //external instance is inside local.
        return period.getStart().isBefore(this.getStart()) && period.getEnd().isAfter(this.getEnd());
    }

    private boolean isStartExternalEndLocal(DatePeriod period) {
        //matches: start of external, end of local
        return this.getStart().isBefore(period.getStart()) && this.getEnd().isBefore(period.getEnd());
    }

    private boolean isStartLocalEndExternal(DatePeriod period) {
        //matches: start of local, end of external
        return period.getStart().isBefore(this.getStart()) && period.getEnd().isBefore(this.getEnd());
    }

    private boolean isStartMatchingEndLocal(DatePeriod period) {
        return period.getStart().isEqual(this.getStart()) && this.getEnd().isBefore(period.getEnd());
    }

    private boolean isStartMatchingEndExternal(DatePeriod period) {
        return period.getStart().isEqual(this.getStart()) && this.getEnd().isAfter(period.getEnd());
    }

    private boolean isEndMatchingStartLocal(DatePeriod period) {
        return period.getStart().isBefore(this.getStart()) && this.getEnd().isEqual(period.getEnd());
    }

    private boolean isEndMatchingStartExternal(DatePeriod period) {
        return this.getStart().isBefore(period.getStart()) && this.getEnd().isEqual(period.getEnd());
    }

    private boolean isPeriodsMatching(DatePeriod period) {
        return this.getStart().isEqual(period.getStart()) && this.getEnd().isEqual(period.getEnd());
    }
}
