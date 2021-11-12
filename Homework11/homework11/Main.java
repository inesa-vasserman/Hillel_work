package Homework11.homework11;

import java.util.*;
import java.util.stream.Collectors;

public class Main extends FinderOccurrence {

    public Main(String name, int occurrence) {
        super(name, occurrence);
    }

    public static void main(String[] args) {

    }

//1. Создать метод countOccurance, принимающий на вход строковый список в качестве параметра и произвольную строку.
// Список заполнен произвольными словами 10-20 штук, которые могут повторяться в неограниченном количестве.
// Посчитать сколько раз встречается переданная строка в качестве второго аргумента.

    public static int countOccurrence(List<String> strings, String target) {
        int count = 0;
        for (String string : strings) {
            if (string.equals(target)) {
                count++;
            }
        }
        System.out.println("Count: " + count);
        return count;
    }
//
//  2. Создать метод toList, принимающий на вход целочисленный массив произвольной длины.
//  Конвертировать массив в список соответствующего типа данных и вернуть из метода.
//  Например:
//    Было Array [1, 2, 3]
//    Стало List [1, 2, 3]

    public static List<Integer> toList(int[] arr) {
        return Arrays.stream(arr).boxed().collect(Collectors.toList());
    }
//
//   3. Создать метод findUnique, принимающий на вход числовой список состоящий из произвольных значений,
//   которые могут повторяться в неограниченном количестве. Необходимо вернуть новый числовой список содержащий только уникальные числа.

    public static List<Integer> findUnique(List<Integer> list) {
        List<Integer> listUnique = new ArrayList<>();
        for (Integer integer : list) {
            if (!listUnique.contains(integer)) {
                listUnique.add(integer);
            }
        }
        return listUnique;
    }
//
//   4. ** Создать метод calcOccurance, принимающий на вход строковый список в качестве параметра.
//   Список заполнен произвольными словами 10-20 штук, которые могут повторяться в неограниченном количестве.
//   Вычислить сколько раз встречается каждое слово. Результат вывести в консоль.
//    Например:
//    bird: 2
//    fox: 1
//    cat: 1

    public static void calcOccurrence(List<String> list) {
        List<String> copyOfList = new ArrayList<>(list);
        for (int i = 0; i < copyOfList.size(); i += 0) {
            int counter = 0;
            System.out.print(copyOfList.get(i) + ": ");
            for (int j = copyOfList.size() - 1; j >= i; j--) {
                if (copyOfList.get(i).contains(copyOfList.get(j))) {
                    copyOfList.remove(j);
                    counter++;
                }
            }
            System.out.println(counter);
        }
        System.out.println();
    }
//
//   4. *** Создать метод findOccurance, принимающий на вход строковый список в качестве параметра.
//   Список заполнен произвольными словами 10-20 штук, которые могут повторяться в неограниченном количестве.
//   Вычислить сколько раз встречается каждое слово. Результат вернуть в виде списка структур описывающих повторение каждого
//   отдельного взятого слова.

//    Например:
//            [
//    {name: "bird", occurrence: 2},
//    {name: "fox", occurrence: 1},
//    {name: "cat", occurrence: 1}
//    ]
//

    public static ArrayList<FinderOccurrence> findOccurrence(List<String> list) {

        ArrayList<FinderOccurrence> foundOccurrences = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            foundOccurrences.add(new FinderOccurrence(String.valueOf(list.get(i)), countOccurrence(list, list.get(i))));
        }

        return foundOccurrences;
    }
}
