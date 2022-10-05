package io.codelex.enums.practice.exercise1;

public enum Directions {
    NORTH("up"),
    SOUTH("down"),
    EAST("right"),
    WEST("left");

    private String direction;
    private Directions(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return this.direction;
    }
}
