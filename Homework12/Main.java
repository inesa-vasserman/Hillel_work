package Homework12;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        String str = "amazon";
        String [] arr = {"mama", "papa", "shop"};
        linkedList.addAll(Arrays.stream(arr).toList());
        LinkedList<String> list = new LinkedList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        shuffle(list);
        System.out.println(list);
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

        LinkedList<Integer> linkedList = new LinkedList<>(listFirst);
        linkedList.addAll(listSecond);
        return linkedList;
    }
//
//            4. Создать метод shuffle, принимающий на вход связный список содержащий любой (на выбор) тип данных, заполненный соответствующими произвольными значениями (10-20 шт.).
//    Метод должен поменять местами имеющиеся внутри списка значения в случайном порядке (тасовка). Каждый потенциальный вызов метода будет возвращать новый результат, где
//    нет гарантии повторения порядка.

    public static void shuffle(LinkedList<String> list) {
        ListIterator<String> iterator = list.listIterator();
        ListIterator<String> iterator2 = list.listIterator();


        while (iterator.hasNext()) {
            String elementsFromStart = "";
            String elementsFromEnd = "";
            int i;
            int j;
            int randomizeStart = (int) (Math.random() * (list.size()));
            System.out.println(randomizeStart);
            int randomizeEnd = (int) (Math.random() * (list.size()));
            System.out.println(randomizeEnd);
            i = randomizeStart;
            j = randomizeEnd;
            while(i > 0) {
                elementsFromStart = iterator.next();
                i--;
            }
            while(j > 0) {
                    elementsFromEnd = iterator2.next();
                    j--;
            }
            list.set(randomizeStart, elementsFromEnd);
            list.set(randomizeEnd, elementsFromStart);

        }
//    return list;
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
