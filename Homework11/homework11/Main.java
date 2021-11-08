package Homework11.homework11;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
     ArrayList<String> people = new ArrayList<String>();
     String[] arrayOfStrings = {"mama", "dad", "father", "dad", "dad", "string", "uncle", "vegans", "sorted", "cat", "dog", "apple", "dad"};
     String str = "dad";
     
     List<String> listOfStrings = Arrays.asList(arrayOfStrings);
     people.addAll(listOfStrings);
        findOccurrence(people);


 }

//1. Создать метод countOccurance, принимающий на вход строковый список в качестве параметра и произвольную строку.
// Список заполнен произвольными словами 10-20 штук, которые могут повторяться в неограниченном количестве.
// Посчитать сколько раз встречается переданная строка в качестве второго аргумента.

    public static int countOccurrence(ArrayList arrayList, String str) {
     int counter = 0;
     while (arrayList.contains(str)) {
         arrayList.remove(str);
         counter += 1;
     }
        return counter;
    }
//
//  2. Создать метод toList, принимающий на вход целочисленный массив произвольной длины.
//  Конвертировать массив в список соответствующего типа данных и вернуть из метода.
//  Например:
//    Было Array [1, 2, 3]
//    Стало List [1, 2, 3]

    public static List toList(int[] arr) {
        List<Integer> arrToList = Arrays.stream(arr).boxed().collect(Collectors.toList());
        return arrToList;
    }
//
//   3. Создать метод findUnique, принимающий на вход числовой список состоящий из произвольных значений,
//   которые могут повторяться в неограниченном количестве. Необходимо вернуть новый числовой список содержащий только уникальные числа.

    public static List<Integer> findUnique(ArrayList arrayList) {
        List<Integer> listUnique = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if(!listUnique.contains(arrayList.get(i))) {
                listUnique.add((Integer) arrayList.get(i));
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

    public static void calcOccurrence(ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + ": ");
            System.out.println(countOccurrence(arrayList, (String) arrayList.get(i)));
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

    public static void findOccurrence(ArrayList arrayList) {
        HashMap<String, String> myHashMap = new HashMap<String, String>();
        Dictionary dictionary = null;
        for (int i = 0; i < arrayList.size(); i++) {
            dictionary.put("name:", (String) arrayList.get(i));
            dictionary.put("occurrence:", String.valueOf(countOccurrence(arrayList, (String) arrayList.get(i))));
        }
        System.out.println(dictionary);

    }
}
