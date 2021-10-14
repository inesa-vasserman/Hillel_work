public class SecondExercise {
    public static void main(String[] args) {
    }

    //    2*) Решить задачу
//    https://leetcode.com/problems/island-perimeter/

    public static int islandPerimeter(int[][] grid) {
        int count = 0;
        int side = 0;
        int counter = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    counter += 1;
                    count += 4;
                    side += 1;
                    if (i < grid.length - 1) {
                        if (grid[i + 1][j] == 1) {
                            count -= 1;
                        }
                    }
                    if (i != 0) {
                        if (grid[i - 1][j] == 1) {
                            count -= 1;
                        }
                    }
                    if (j != 0) {
                        if (grid[i][j - 1] != 0) {
                            count -= 1;
                        }
                    }
                    if (j < grid[i].length - 1) {
                        if (grid[i][j + 1] != 0) {
                            count -= 1;
                        }
                    }

                }
            }

        }
        if (counter == 1) {
            return 4;
        } else {

            return count;
        }

    }
}
