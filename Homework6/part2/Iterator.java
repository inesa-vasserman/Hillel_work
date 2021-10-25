package Homework6.part2;

import java.util.Arrays;

public class Iterator {
    private int sumOfNumber;
    private int[] newArr;
    private int indexArr = -1;

    public Iterator(int[][] arr) {
        countLength(arr);
        getSortedArr(arr);
    }

    public int countLength(int[][] arr) {
        sumOfNumber = 0;
        int i;
        for (i = 0; i < arr.length; i++) {
            sumOfNumber += arr[i].length;
        }
        sumOfNumber += arr.length - i;
        newArr = new int[sumOfNumber];
        return sumOfNumber;
    }

    public boolean hasNext() {
        while (indexArr < newArr.length - 1) {
            return true;
        }
        return false;
    }

    public int next() {
        while (indexArr < newArr.length - 1) {
            indexArr++;
            return newArr[indexArr];
        }
        return newArr[newArr.length - 1];
    }

    public int[] getSortedArr(int[][] arr) {

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                newArr[index] += arr[i][j];
                index++;
            }
        }
        Arrays.sort(newArr);
        return newArr;
    }
}
