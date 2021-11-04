package ua.ithillel.current;

import java.util.Random;

import static ua.ithillel.current.TicTacToe.fieldSize;

public class AICoordinateFinder implements CoordinateFinder {

    private static final char AI_SYMBOL = 'O';

    private final Random random = new Random();


    @Override
    public MoveResult findCoordinate() {
        int vertical = random.nextInt(fieldSize);
        int horizontal = random.nextInt(fieldSize);
        return new MoveResult(AI_SYMBOL, new Coordinate(vertical, horizontal));
    }

}
