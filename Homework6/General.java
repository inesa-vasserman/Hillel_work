package Homework6;

import Homework7.OOP.Cat;
import Homework7.OOP.Human;
import Homework7.OOP.Participant;
import Homework7.OOP.Robot;

public class General {
    public static void main(String[] args) {

        Figures[] figures = getFigures();
    }

    static Figures[] getFigures() {
        return new Figures[]{
                new Circle(1), new Square(8), new Triangle(5, 45)
        };
    }

    public static double getSumSquare(Figures[] figures) {
        double result = 0.0;
        for (int i = 0; i < figures.length; i++) {
            result += figures[i].getSquare();
        }
        return result;
    }
}
