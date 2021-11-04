package ua.ithillel.current;

public class ResultGame extends TicTacToe {

    int counter = 0;

    public ResultGame() {
    }

    public boolean checkResultPlayer(char[][] field) {
        char[] elements = {'O', 'X'};
        String[] players = {"Computer", "Player"};
        for (int k = 0; k < elements.length; k++) {

            for (char[] chars : field) {
                counter = 0;

                for (int j = 0; j < chars.length; j++) {
                    if (checkSymbol(chars[j], elements[k])) {
                        printResult(players[k]);
                        return true;
                    }
                }
            }
            for (int i = 0; i < field.length; i++) {
                counter = 0;

                for (int j = 0; j < field[i].length; j++) {

                    if (checkSymbol(field[j][i], elements[k])) {
                        printResult(players[k]);
                        return true;
                    }
                }
            }

            counter = 0;
            for (int i = 0; i < field.length; i++) {

                if (checkSymbol(field[i][i], elements[k])) {
                    printResult(players[k]);
                    return true;

                }
            }

            counter = 0;
            int j = field.length - 1;
            for (char[] chars : field) {
                if (checkSymbol(chars[j], elements[k])) {
                    printResult(players[k]);
                    return true;
                }
                j--;
            }
        }
        return checkTie(field);
    }

    public boolean checkSymbol(char index, char symbol) {
        if (index == symbol) {
            counter++;
        } else {
            counter = 0;
        }
        return counter == fieldSize;
    }

    public void printResult(String player) {
        if (player.equals("Player")) {
            System.out.println("You win");
        } else {
            System.out.println("You lose");
        }

    }

    public boolean checkTie(char[][] field) {

        int commonLength = field.length * field.length;
        int checker = 0;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] != '-') {
                    checker++;
                }
            }
        }
        if (checker == commonLength) {
            System.out.println("It's a tie...");
        }

        return checker == commonLength;
    }

}