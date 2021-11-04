package ua.ithillel.current;

import java.util.Scanner;

public class PlayerCoordinateFinder implements CoordinateFinder {

    private static final char PLAYER_SYMBOL = 'X';

    private final Scanner scanner = new Scanner(System.in);

    @Override
    public MoveResult findCoordinate() {
        int vertical = chooseCoordinate('v');
        int horizontal = chooseCoordinate('h');
        return new MoveResult(PLAYER_SYMBOL, new Coordinate(vertical, horizontal));
    }

    private int chooseCoordinate(char coordinateSymbol) {
        int coordinate;

        do {
            System.out.printf("Please enter %s-coordinate [1-3] ...%n", coordinateSymbol);
            coordinate = scanner.nextInt() - 1;
        } while (coordinate < 0 || coordinate >= 3);

        return coordinate;
    }
}
