package Homework12.coffee.order;

public class Order {


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
