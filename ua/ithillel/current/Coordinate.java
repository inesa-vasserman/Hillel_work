package ua.ithillel.current;

public class Coordinate {
    private final int vertical;
    private final int horizontal;

    public Coordinate(int vertical, int horizontal) {
        this.vertical = vertical;
        this.horizontal = horizontal;
    }

    public int getVertical() {
        return vertical;
    }

    public int getHorizontal() {
        return horizontal;
    }
}
