package Homework5.vehicles;

public class Lorry extends Car {
    private int carrying;

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "carrying=" + carrying +
                '}';
    }
}