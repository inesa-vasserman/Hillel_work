package com.hillel.hw3;

import java.util.Arrays;
import java.util.Random;

public class Exercises {
    public static void main(String[] args) {
    }

//    2) Задан массив случаных чисел типа int в котором есть положительные и отрицательные числа.
//    Написать метод который вернет массив квадратов этих чисел, отсортированных по возрастанию.

    public static int[] getSortPower() {
        int[] arr = new int[100];
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            int randNum = random.nextInt();
            ;
            arr[i] = randNum;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.pow(arr[i], 2);
        }
        Arrays.sort(arr, 0, arr.length);
        return arr;
    }

//    4*) Написать метод у которого 2 входящих параметра типа String.
//    Метод должен вернуть true если путем перестановки символов можно из первой строки получить вторую. Например:
//            "asdf", "fdsa" => true
//            "asdf", "asdfg => false
//            "aab", "bba" => false

    public boolean chechEquals(String firstLine, String secondLine) {
        char[] arrayOfElements = firstLine.toCharArray();
        char[] arrayCheckElements = secondLine.toCharArray();
        if (arrayOfElements.length == arrayCheckElements.length) {
            StringBuilder sbElements = new StringBuilder();
            sbElements.append(firstLine);
            StringBuilder sbCheckElements = new StringBuilder();
            sbCheckElements.append(secondLine);
            int lengthArray = arrayCheckElements.length;
            while (lengthArray != 0) {
                for (int j = 0; j < arrayCheckElements.length; j++) {
                    if (arrayCheckElements[j] == arrayOfElements[0]) {
                        sbElements.deleteCharAt(0);
                        arrayOfElements = sbElements.toString().toCharArray();
                        sbCheckElements.deleteCharAt(j);
                        arrayCheckElements = sbCheckElements.toString().toCharArray();

                    }


                }
                lengthArray--;
            }
        }
        if (arrayCheckElements.length == 0) {
            return true;
        }

        return false;
    }
}


