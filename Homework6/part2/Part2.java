package Homework6.part2;

public class Part2 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 3, 5},
                {1, 3, 7},
                {2, 2, 3, 6}
        };


        Iterator iterator = new Iterator(arr);

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        } // 1, 1, 2, 2, 3, 3, 3, 5, 6, 7

    }
}
