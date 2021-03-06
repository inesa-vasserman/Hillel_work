package FirstHomeworks.Homework3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Exercise {
    public int[] randomArr = new int[10];
    public int average = 0;
    public String newString = "";
    public double result;
    public int sizeHorizontal = 0;
    public int sizeVertical = 0;

    public static void main(String[] args) {

        // Вывести ряд чисел от 1 до 100 через пробел, с изменениями
        //- если число кратно 3 то вместо него вывести Hello
        //
        //- если число кратно 5 то вместо него вывести World
        //
        //- если число кратно и 3 и 5 то вместо него вывести HelloWorld


        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.print("Hello ");
            } else if (i % 3 != 0 && i % 5 == 0) {
                System.out.print("World ");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("HelloWorld ");
            } else {
                System.out.print(i + " ");
            }
        }


    }

    // Написать метод который вернет String в которой будут в одну строку числа от 1 до 30. Каждое число при этом взять в круглые скобки ()
    // FIXED

    public String makeLineNumber() {
        String res = "";
        StringBuilder stringLine = new StringBuilder();
        for (int i = 1; i < 31; i++) {
            stringLine.append("(").append(i).append(")");
        }
        return stringLine.toString();

    }

    // Заполнить массив из 10 элементов случайными целыми числами от 10(включительно) до 20(включительно). Вывести среднее арифметическое.
    // FIXED

    public double randomizeArray() {
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            int randNum = random.nextInt(10 + 1) + 10;
            randomArr[i] = randNum;
            average += randNum;
        }
        result = average / 10.0;

        return result;
    }

    // Написать метод который убирает лишние пробелы в строке и возвращает строку.

    public String deleteSpace(String str) {
        char[] toCharArray = str.trim().toCharArray();
        for (int i = 0; i < toCharArray.length; i++) {
            char space = ' ';
            if (toCharArray[i] == space && toCharArray[i + 1] == space) {
            } else {
                newString = newString + toCharArray[i];
            }

        }


        return newString;
    }

    // Задан 2-мерный массив char и слово. Написать метод который определит есть ли по вертикали или горизонтали это слово.
    // Например, в данном случае для слова test метод должен вернуть true:
    // Массив загрузить из текстового файла


    public boolean checkArray(String filename, String strTest) {
        char[][] args = load(filename);
        char[] stringToArray = strTest.toCharArray();
        int countLine = args.length;
        int countCol = args[0].length;
        int counter = 0;

        for (char[] arg : args) {
            for (char c : arg) {
                if (c == stringToArray[counter]) {
                    counter++;
                    for (char value : arg) {
                        if (value == stringToArray[counter]) {
                            counter++;
                        }
                    }
                    if (counter == stringToArray.length) {
                        return true;
                    }
                } else {
                    counter = 0;
                }
            }
        }

        for (int i = 0; i < countCol; i++) {
            for (char[] arg : args) {
                if (arg[i] == stringToArray[counter]) {
                    counter++;
                    if (counter == stringToArray.length) {
                        return true;
                    }
                } else {
                    counter = 0;
                }
            }
        }

        return false;
    }

    public char[][] load(String filename) {
        countSize(filename);
        char[][] args = new char[sizeVertical + 1][sizeHorizontal];
        try {
            File myObj = new File(filename);
            Scanner myReader = new Scanner(myObj);
            for (int i = 0; i < args.length; i++) {
                for (int j = 0; j < args[i].length; j++) {
                    String data = myReader.next();
                    if (!data.equals(" ")) {
                        args[i][j] = data.charAt(0);
                    }
                }
            }

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return args;
    }

    public void countSize(String filename) {
        String counterLine = "";
        try {
            File myObj = new File(filename);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                sizeVertical++;

                if (sizeVertical == 1) {
                    counterLine = myReader.nextLine().replaceAll(" ", "");
                }
                myReader.nextLine();
            }
            sizeHorizontal = counterLine.length();
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}