package Homework6;

public class Circle implements Figures {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getSquare() {
        return (double) (3.14 * radius);
    }
}