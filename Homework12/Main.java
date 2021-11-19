package Homework12;

import java.util.*;

public class Main {


    public static void main(String[] args) {
    }

//    1. Создать метод addFirst, принимающий на вход связный список и строку. Добавить в конец списка переданное строковое значение.

    public static LinkedList<String> addFirst(LinkedList<String> list, String str) {
        list.addLast(str);
        return list;
    }
//
//2. Создать метод addLast, принимающий на вход связный список и строку. Добавить в начало списка переданное строковое значение.

    public static LinkedList<String> addLast(LinkedList<String> list, String str) {
        list.addFirst(str);
        return list;
    }
//
//3. Создать метод join, принимающий на вход два целочисловых связных списка, заполненные произвольными значениями (5-10 шт. в каждом).
//    Метод должен возвращать объединение двух переданных списков.
//            Например:
//    param1 [1, 2, 3]
//    param2 [5, 7, 8]
//    result [1, 2, 3, 5, 7, 8]

    public static LinkedList<Integer> join(LinkedList<Integer> listFirst, LinkedList<Integer> listSecond) {

        LinkedList<Integer> joinedList = new LinkedList<>(listFirst);
        joinedList.addAll(listSecond);
        return joinedList;
    }
//
//            4. Создать метод shuffle, принимающий на вход связный список содержащий любой (на выбор) тип данных, заполненный соответствующими произвольными значениями (10-20 шт.).
//    Метод должен поменять местами имеющиеся внутри списка значения в случайном порядке (тасовка). Каждый потенциальный вызов метода будет возвращать новый результат, где
//    нет гарантии повторения порядка.

    public static LinkedList<String> shuffle(LinkedList<String> list) {
        ArrayList<Integer> randomUsedNumbers = new ArrayList<>();
        int size = list.size() - 1;

        while (size >= 0) {


            int firstRandomIndex = (int) (Math.random() * (list.size()));
            int SecondRandomIndex = (int) (Math.random() * (list.size()));

            if (!randomUsedNumbers.contains(firstRandomIndex) && !randomUsedNumbers.contains(SecondRandomIndex) && firstRandomIndex != SecondRandomIndex) {

                list.set(firstRandomIndex, list.get(SecondRandomIndex));
                list.set(SecondRandomIndex, list.get(firstRandomIndex));

                randomUsedNumbers.add(firstRandomIndex);
                randomUsedNumbers.add(SecondRandomIndex);
                size -= 2;
            }
        }
        return list;
    }
//
//            5. Создать метод intersect, принимающий на вход два целочисловых связных списка, заполненные произвольными значениями (5-10 шт. в каждом).
//    Метод должен вернуть новый связный список содержащий только элементы имеющиеся одновременно в каждом из переданных список (пересечение).
//    Например:
//    param1 [1, 2, 3]
//    param2 [3, 2, 5, 7]
//    result [2, 3]

    public static LinkedList<Integer> intersect(LinkedList<Integer> listFirst, LinkedList<Integer> listSecond) {
        LinkedList<Integer> result = new LinkedList<>(listFirst);
        result.retainAll(listSecond);
        return result;
    }

}
