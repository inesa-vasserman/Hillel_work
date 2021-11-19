package Homework12.coffee.order;

public class Order {

    //        2. Создать класс Order. Класс является цифровым представлением заказа. Данный класс содержит номер заказа и имя человека его заказавшего.


    public int number;
    private String name;


    public Order(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
}
