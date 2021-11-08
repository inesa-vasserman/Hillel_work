package homework9;

import java.util.Random;

public class AICoordinateFinder implements CoordinateFinder {

    private static final char AI_SYMBOL = 'O';

    private final Random random = new Random();


    @Override
    public MoveResult findCoordinate() {
        int vertical = random.nextInt(TicTacToe.fieldSize);
        int horizontal = random.nextInt(TicTacToe.fieldSize);
        return new MoveResult(AI_SYMBOL, new Coordinate(vertical, horizontal));
    }

}
