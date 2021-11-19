package Homework12.coffee.order;

import java.util.LinkedList;

public class CoffeeOrderBoard {

    private LinkedList<Order> orders = new LinkedList<>();

    public static void main(String[] args) {
    }

    public void add(String name) {
        orders.add(new Order(orders.size() + 1, name));
    }

    public Order deliver() {
        return orders.pollFirst();
    }

    public Order deliver(int number) {
        Order order = find(number);
        orders.remove(order);
        return order;
    }

    private Order find(int number) {
        for (Order order : orders) {
            if (order.getNumber() == number) {
                return order;
            }
        }
        return null;
    }

    public void drawTable() {
        System.out.println("=============");
        System.out.println("Num   |  Name");
        for (Order order : orders) {
            if (order.getNumber() < 10) {
                System.out.println(order.getNumber() + "     |  " + order.getName());
            } else {
                System.out.println(order.getNumber() + "    |  " + order.getName());
            }
        }
    }

//0. Создать новый пакет coffee.order
//
//        1. Создать класс CoffeeOrderBoard. Класс является цифровым представлением очереди заказов в кофейне.
//        Данный класс содержит список заказов.
//
//        2. Создать класс Order. Класс является цифровым представлением заказа. Данный класс содержит номер заказа и имя человека его заказавшего.
//
//        3. Реализовать метод add в классе CoffeeOrderBoard. Данный метод добавляет новый заказ и присваивает заказу номер (натуральный порядок).
//        Натуральный порядок (natural ordering) означенает, что если у последнего заказа номер 86, то следущий будет 87.
//        Не может быть такой ситуации, что номер повторяется в рамках одного объекта типа CoffeeOrderBoard.
//
//        4. Реализовать метод deliver в классе CoffeeOrderBoard. Данный метод выдает ближайший на очереди заказ. Выдача сопровождается удалением заказа с списка.
//
//        5. Реализовать метод deliver в классе CoffeeOrderBoard. Данный метод выдает заказ с определенным номеров. Выдача сопровождается удалением заказа с списка.
//        Данный метод обслуживает ситуацию, когда заказ поступивший позже готов раньше.
//
//        6. Реализовать метод draw в классе CoffeeOrderBoard. Данный метод выводит в консоль информацию о текущем состоянии очереди в порядке ближайшего к выдаче заказа.
//        Например:
//        =============
//        Num   |  Name
//        4     |  Alen
//        27    |  Yoda
//        33    |  Obi-van
//        34    |  John Snow

}