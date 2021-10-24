package Homework6;

public class Square implements Figures {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double getSquare() {
        return side * side;
    }
}
