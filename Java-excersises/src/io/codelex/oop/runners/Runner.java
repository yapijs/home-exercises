package io.codelex.oop.runners;

import java.time.LocalTime;

public enum Runner {
    ADVANCED(LocalTime.of(2,0,0), LocalTime.of(3,0, 0)),
    INTERMEDIATE(LocalTime.of(3,0,0), LocalTime.of(4,0, 0)),
    BEGINNER(LocalTime.of(4,0,0), LocalTime.of(6,0, 0));

    private final LocalTime min;
    private final LocalTime max;

    Runner(LocalTime min, LocalTime max) {
        this.min = min;
        this.max = max;
    }

    public LocalTime getMin() {
        return min;
    }

    public LocalTime getMax() {
        return max;
    }

    public static Runner getFitnessLevel(LocalTime marathonTime) {
        if (marathonTime.compareTo(ADVANCED.min) >= 0 && marathonTime.isBefore(ADVANCED.max)) {
            return ADVANCED;
        }
        if (marathonTime.compareTo(INTERMEDIATE.min) >= 0 && marathonTime.isBefore(INTERMEDIATE.max)) {
            return INTERMEDIATE;
        }
        if (marathonTime.compareTo(BEGINNER.min) >= 0 && marathonTime.isBefore(BEGINNER.max)) {
            return BEGINNER;
        }
        return null;
    }


}
