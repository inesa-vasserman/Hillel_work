package com.hillel;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
    }

//    Создать метод findSymbolOccurance. Метод принимает в качестве
//    параметров строку и символ. Необходимо вычислить, сколько раз
//    символ встречается в переданной строке и вернуть это числовое значение.

    public static int findSymbolOccurrence(String str, char ch) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                counter += 1;
            }

        }
        return counter;
    }

//    Создать метод findWordPosition. Метод принимает в качестве параметров две строки (source, target).
//    Необходимо выяснить, является ли target (подстрока) частью строки source. Если да, тогда вернуть номер позиции (индекс)
//    первого элемента подстроки в строке, иначе вернуть -1.
//    Пример 1:
//    Source: Apollo
//    Target: pollo
//    Result: 1
//
//    Пример 2:
//    Source: Apple
//    Target: Plant
//    Result: -1

    public static int findWordPosition(String source, String target) {
        int finalResult = 0;
        int counter = 0;
        for (int i = 0; i < source.length(); i++) {
            if (source.charAt(i) == target.charAt(finalResult) && finalResult < target.length()) {
                finalResult++;
                counter++;
                if (counter == target.length()) {
                    for (i = 0; i < source.length(); i++) {
                        finalResult = 0;
                        if (source.charAt(i) == target.charAt(finalResult)) {
                            finalResult++;
                            return finalResult;
                        }
                    }
                }
            }
        }
        return -1;
    }

//    4. Создать метод stringReverse. Метод принимает в качестве параметра строку.
//    Необходимо ее развернуть и вернуть измененный вариант.
//            Например:
//    Hello -> olleH

    public static String stringReverse(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

//    5. Создать метод isPalindrome. Метод принимает в качестве параметра строку. Необходимо Проверить является ли переданная строка палиндромом. Если да, тогда вернут true, иначе false.
//    Пример 1:
//    ERE -> true
//
//    Пример 2:
//    Allo -> false

    public static boolean isPalindrome(String str) {
        int indexToReverse = str.length() - 1;
        for (int i = 0; i <= str.length() / 2; i++) {
            if (i <= indexToReverse) {
                if (str.charAt(i) == str.charAt(indexToReverse)) {
                    indexToReverse--;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

//    6. * Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana",
//    "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi",
//    "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
//    При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
//    сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. Если слово не угадано,
//    компьютер показывает буквы которые стоят на своих местах.
//            apple – загаданное
//    apricot - ответ игрока
//    ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
//    Для сравнения двух слов посимвольно, можно пользоваться:
//    String str = "apple";
//str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
//    Играем до тех пор, пока игрок не отгадает слово
//    Используем только маленькие буквы

    public static void guessWord() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi",
                "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        StringBuilder sb = new StringBuilder(words[random.nextInt(words.length)]);
        StringBuilder guessedWord = new StringBuilder("###############");
        while (true) {
            int counter = 0;
            String word = scanner.next();
            int indexString = 0;
            for (int i = 0; i < word.length(); i++) {
                if (indexString < sb.length() && word.charAt(i) == sb.charAt(indexString)) {
                    guessedWord.replace(i, i + 1, Character.toString(word.charAt(i)));
                    counter++;
                }
                indexString++;
            }

            if (counter == sb.length()) {
                System.out.println(sb);
                System.out.println("You won!!!!!");
                System.exit(0);

            } else {

                System.out.print(guessedWord);
            }
            System.out.println();
        }
    }


}
