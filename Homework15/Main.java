package Homework15;

public class Main {
}
//1. Создать метод toList. Метод принимает на вход массив и преобразовывает его в список. Коллекция хранит точно такой же тип данных, как и входной массив.
//        После преобразования необходимо вернуть только что созданный список.
//
//        2. Ящики-фрукты
//
//        2.1 Создать базовый тип Fruit.
//
//        2.2 Создать типы Apple, Orange что реализовывают тип Fruit.
//
//        2.3  Создать тип Box. В коробку можно складывать фрукты. Однако, в одну коробку нельзя сложить фрукты одинакого типа.
//        Например: яблоки с апельсины будет недопустимой комбинацией.
//
//        2.4. Реализовать метод добавление фрукта (1 ед.) в коробку.
//
//        2.5. Реализовать метод добавление фруктов (множ.) в коробку.
//
//        2.6 Реализовать метод getWeight(). Метод высчитывает вес коробки на основании веса одного фрукта и его количества.
//        Вес: яблока - 1.0F, апельсина - 1.5F.
//
//        2.7 В классе Box реализовать метод compare. Метод производит сравнение текущую коробки с переденной в качестве параметра.
//        Возвращать true - если их веса равны, в противном случае - false
//        ВАЖНО! Можно сравнивать коробки содержащие различные фрукты. Так, коробки с яблоками возможно сравнивать с коробками с апельсинами и так далее.
//
//        2.8 Реализовать метод merge. Метод выполняет пересыпание из переданной коробки в качестве параметра, в текущую.
//        Однако, стоит учитывать, что в одну коробку нельзя сложить фрукты одинакого типа.
//
