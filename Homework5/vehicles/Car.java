package Homework5.vehicles;

import Homework5.details.Engine;
import Homework5.professions.Driver;

public class Car {
    private String carClass;
    private Engine engine;
    private Driver driver;
    private String brand;

    public void start() {
        System.out.print("Поехали...");
    }

    public void stop() {
        System.out.print("Останавливаемся...");
    }

    public void turnRight() {
        System.out.print("Поворот направо...");
    }

    public void urnLeft() {
        System.out.print("Поворот налево...");
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carClass='" + carClass + '\'' +
                ", engine=" + engine +
                ", driver=" + driver +
                ", brand='" + brand + '\'' +
                '}';
    }
}