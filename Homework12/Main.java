package Homework12;

import java.util.*;

public class Main {

    public void main(String[] args) {
    }

//    1. Создать метод addFirst, принимающий на вход связный список и строку. Добавить в конец списка переданное строковое значение.

    public LinkedList<String> addFirst(LinkedList<String> source, String target) {
        source.addLast(target);
        return source;
    }
//
//2. Создать метод addLast, принимающий на вход связный список и строку. Добавить в начало списка переданное строковое значение.

    public LinkedList<String> addLast(LinkedList<String> source, String target) {
        source.addFirst(target);
        return source;
    }
//
//3. Создать метод join, принимающий на вход два целочисловых связных списка, заполненные произвольными значениями (5-10 шт. в каждом).
//    Метод должен возвращать объединение двух переданных списков.
//            Например:
//    param1 [1, 2, 3]
//    param2 [5, 7, 8]
//    result [1, 2, 3, 5, 7, 8]

    public LinkedList<Integer> join(LinkedList<Integer> firstBatchOfValues, LinkedList<Integer> secondBatchOfValues) {

        LinkedList<Integer> combiningList = new LinkedList<>(firstBatchOfValues);
        combiningList.addAll(secondBatchOfValues);
        return combiningList;
    }
//
//            4. Создать метод shuffle, принимающий на вход связный список содержащий любой (на выбор) тип данных, заполненный соответствующими произвольными значениями (10-20 шт.).
//    Метод должен поменять местами имеющиеся внутри списка значения в случайном порядке (тасовка). Каждый потенциальный вызов метода будет возвращать новый результат, где
//    нет гарантии повторения порядка.

    public LinkedList<String> shuffle(LinkedList<String> source) {

        Collections.shuffle(source);

//        ArrayList<Integer> randomUsedNumbers = new ArrayList<>();
//        int size = source.size() - 1;
//
//        while (size >= 0) {
//
//
//            int firstRandomIndex = (int) (Math.random() * (source.size()));
//            int SecondRandomIndex = (int) (Math.random() * (source.size()));
//
//            if (!randomUsedNumbers.contains(firstRandomIndex) && !randomUsedNumbers.contains(SecondRandomIndex) && firstRandomIndex != SecondRandomIndex) {
//
//                source.set(firstRandomIndex, source.get(SecondRandomIndex));
//                source.set(SecondRandomIndex, source.get(firstRandomIndex));
//
//                randomUsedNumbers.add(firstRandomIndex);
//                randomUsedNumbers.add(SecondRandomIndex);
//                size -= 2;
//            }
//        }
        return source;
    }
//
//            5. Создать метод intersect, принимающий на вход два целочисловых связных списка, заполненные произвольными значениями (5-10 шт. в каждом).
//    Метод должен вернуть новый связный список содержащий только элементы имеющиеся одновременно в каждом из переданных список (пересечение).
//    Например:
//    param1 [1, 2, 3]
//    param2 [3, 2, 5, 7]
//    result [2, 3]

    public LinkedList<Integer> intersect(LinkedList<Integer> firstBatchOfValues, LinkedList<Integer> secondBatchOfValues) {
        LinkedList<Integer> result = new LinkedList<>(firstBatchOfValues);
        result.retainAll(secondBatchOfValues);
        return result;
    }

}
