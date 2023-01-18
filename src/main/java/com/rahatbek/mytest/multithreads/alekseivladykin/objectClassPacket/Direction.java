package com.rahatbek.mytest.multithreads.alekseivladykin.objectClassPacket;

public enum Direction {
    UP('U'),
    DOWN('D'),
    LEFT('L'),
    RIGHT('R');

    private final char code;

    Direction(char code) {
        this.code = code;
    }

    public char getCode() {
        return code;
    }

    public Direction opposite() {
        if (this == RIGHT) {
            return LEFT;
        }

        switch (this) {
            case UP: return DOWN;
            case DOWN: return UP;
            case LEFT: return RIGHT;
            case RIGHT: return LEFT;
            default: throw new IllegalArgumentException();
        }
    }
}
