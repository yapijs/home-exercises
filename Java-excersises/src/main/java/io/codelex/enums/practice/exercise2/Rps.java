package io.codelex.enums.practice.exercise2;

public enum Rps {
    SCISSORS("s"),
    ROCK("r"),
    PAPER("p");

    private final String shortName;

    Rps(String shortName) {
        this.shortName = shortName;
    }

    public static Rps valueOfLabel(String label) {
        for (Rps val : values()) {
            if (val.shortName.equals(label)) {
                return val;
            }
        }
        return null;
    }
}
