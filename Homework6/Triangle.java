package Homework6;

public class Triangle implements Figures {
    private int height;
    private int side;

    public Triangle(int height, int side) {
        this.height = height;
        this.side = side;
    }

    @Override
    public double getSquare() {
        double result = (int) (side * 0.5 / height);
        return result;
    }
}