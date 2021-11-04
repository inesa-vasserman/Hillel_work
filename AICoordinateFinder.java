package ua.ithillel.current;

import java.util.Random;

public class AICoordinateFinder implements CoordinateFinder {

    private static final char AI_SYMBOL = 'O';

    private final Random random = new Random();

    @Override
    public MoveResult findCoordinate() {
        int vertical = random.nextInt(3);
        int horizontal = random.nextInt(3);
        return new MoveResult(AI_SYMBOL, new Coordinate(vertical, horizontal));
    }

}
