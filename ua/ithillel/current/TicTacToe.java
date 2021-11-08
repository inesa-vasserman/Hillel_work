package ua.ithillel.current;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {

    private static final char EMPTY_SYMBOL = '-';
    public static int fieldSize;
    public static final int BOUND_OF_SIZE = 10;
    public static int endingOfGame;

    private final Scanner scanner = new Scanner(System.in);

    public char[][] field = {};

    public void start() {

        do {
            field = createField();
            CoordinateFinder playerMoveAction = new PlayerCoordinateFinder();
            CoordinateFinder aiMoveAction = new AICoordinateFinder();
            ResultGame resultGame = new ResultGame();

            drawField();
            endingOfGame = 0;

            while (!resultGame.checkResultPlayer(field)) {

                doMove(playerMoveAction);
                resultGame.checkResultPlayer(field);
                doMove(aiMoveAction);

                drawField();
            }
        } while (startNewRound());
    }


    private void doMove(CoordinateFinder coordinateFinder) {
        MoveResult moveResult;
        Coordinate coordinate;

        if (endingOfGame != fieldSize * fieldSize) {

            moveResult = coordinateFinder.findCoordinate();
            coordinate = moveResult.getCoordinate();

            while (field[coordinate.getVertical()][coordinate.getHorizontal()] != EMPTY_SYMBOL) {

                moveResult = coordinateFinder.findCoordinate();
                coordinate = moveResult.getCoordinate();
            }

            field[coordinate.getVertical()][coordinate.getHorizontal()] = moveResult.getSymbol();
        }
        endingOfGame++;
    }

    private int writeSize() {

        System.out.printf("What size of line do you want? Please, choose from 3 to %s", BOUND_OF_SIZE);
        System.out.println();

        do {
            System.out.println("Please, write your answer");
            fieldSize = scanner.nextInt();
        }
        while (fieldSize < 3 || fieldSize > BOUND_OF_SIZE);
        return fieldSize;
    }

    private char[][] createField() {
        fieldSize = writeSize();
        char[][] field = new char[fieldSize][fieldSize];
        for (char[] chars : field) {
            Arrays.fill(chars, EMPTY_SYMBOL);
        }

        return field;
    }


    private void drawField() {

        for (char[] chars : field) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(chars[j]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    private boolean startNewRound() {

        int answer;
        System.out.println("Do you want to play one more time? 1 - Yes. 2 - No.");
        do {
            System.out.println("Please, write your answer");
            answer = scanner.nextInt();
        }
        while (answer != 1 && answer != 2);
        return answer == 1;
    }

}
