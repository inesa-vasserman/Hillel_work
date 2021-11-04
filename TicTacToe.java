package ua.ithillel.current;

public class TicTacToe {

    private static final char EMPTY_SYMBOL = '-';
    private static final int FIELD_SIZE = 3;

    private final char[][] field = {
            {EMPTY_SYMBOL, EMPTY_SYMBOL, EMPTY_SYMBOL},
            {EMPTY_SYMBOL, EMPTY_SYMBOL, EMPTY_SYMBOL},
            {EMPTY_SYMBOL, EMPTY_SYMBOL, EMPTY_SYMBOL},
    };

    public void start() {
        CoordinateFinder playerMoveAction = new PlayerCoordinateFinder();
        CoordinateFinder aiMoveAction = new AICoordinateFinder();

        drawField();

        doMove(playerMoveAction);
        doMove(aiMoveAction);

        drawField();
    }

    private void doMove(CoordinateFinder coordinateFinder) {
        MoveResult moveResult;
        Coordinate coordinate;

        do {
            moveResult = coordinateFinder.findCoordinate();
            coordinate = moveResult.getCoordinate();
        } while (field[coordinate.getVertical()][coordinate.getHorizontal()] != EMPTY_SYMBOL);

        field[coordinate.getVertical()][coordinate.getHorizontal()] = moveResult.getSymbol();
    }

    private void drawField() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
