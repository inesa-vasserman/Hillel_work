package Homework14;

import java.util.*;

public class Main {

    public static void main(String[] args) {
    }

    //1. Создать метод convertToUnique. Метод принимает строковый список заполненый произвольными значениями, которые могут повторяться.
//        Необходимо вернуться последовательность строк, но без учета повторений.
//        Например:
//        Дано: [Привет, Мир, Привет, !]
//        Будет хранить: [Привет, Мир, !]

    public static Set<String> convertToUnique(List<String> source) {
        return new HashSet<>(source);
    }


    //        2. Создать метод getSortedUniqueIntegersASC. Метод принимает на вход список целочисленных значений,
    //        заполненый произвольными значениями, которые могут повторяться. Необходимо вернуться последовательность целочисленных значений,
    //        но без учета повторений, отсортированных по возрастанию.

    public static Set<Integer> getSortedUniqueIntegersASC(List<Integer> source) {
        return new TreeSet<>(source);
    }

    //        3. Создать метод getSortedUniqueIntegersDESC. Метод принимает на вход список целочисленных значений, заполненый
    //        произвольными значениями, которые могут повторяться. Необходимо вернуться последовательность целочисленных значений,
    //        но без учета повторений, отсортированных по убыванию.

    public static Set<Integer> getSortedUniqueIntegersDESC(List<Integer> source) {
        Collections.sort(source);
        Collections.reverse(source);
        return new LinkedHashSet<>(source);

    }

    //        4. * Создать метод buildSentenceDirection. Метод принимает на вход набор строковых значений, заполненый произвольными значениями, которые могут повторяться.
    //        Необходимо вернуться последовательность строковых значений, но без учета повторений, которые сохранят
//        последовательность вставки после создания такой последовательности.
//        Например:
//        Дано: [Привет, Мир, Привет, !, !]
//        Будет хранить значения в точной последовательности и никак иначе: [Привет, Мир, !]

    public static Set<String> buildSentenceDirection(List<String> source) {
        return new LinkedHashSet<>(source);
    }
}
