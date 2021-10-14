import java.util.Random;

public class FirstExercise {
    public static void main(String[] args) {
    }

    //    1) решить задачу:
//    https://leetcode.com/problems/sort-array-by-parity/
//    Задан массив случайных чисел. Написать метод который вернет массив в котором сначала будут все четные элементы, а потом все нечетные из исходного.
    public int[] sortArrayByParity() {
        int[] numbs = new int[10];
        for (int i = 0; i < numbs.length; i++) {
            Random random = new Random();
            int randNum = random.nextInt();
            numbs[i] = randNum;
        }
        int[] numbsSorted = new int[numbs.length];
        int indexSorted = 0;
        for (int i = 0; i < numbs.length; i++) {
            if (numbs[i] % 2 == 0) {
                numbsSorted[indexSorted] = numbs[i];
                indexSorted++;
            }
        }

        for (int i = 0; i < numbs.length; i++) {

            if (numbs[i] % 2 != 0) {
                numbsSorted[indexSorted] = numbs[i];
                indexSorted++;
            }
        }

        return numbsSorted;
    }
}

