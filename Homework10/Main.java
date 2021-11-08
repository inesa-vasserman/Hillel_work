package Homework10;

public class Main {

    public static void main(String[] args) {
        ArrayValueCalculator calculator = new ArrayValueCalculator();

        System.out.println(tryCalculating(calculator, new String[][]{}));

        System.out.println(tryCalculating(calculator, new String[][]{{"123", "2"}}));

        System.out.println(tryCalculating(calculator, new String[][]{
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "A"},
                {"1", "2", "3", "4"},
        }));

        System.out.println(tryCalculating(calculator, new String[][]{
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
        }));
    }

    static int tryCalculating(ArrayValueCalculator calculator, String[][] values) {
        try {
            return calculator.doCalc(values);
        } catch (MyArraySizeException ex) {
            ex.printStackTrace();
            System.out.println("Matrix does have incorrect size. Please check it.");
        } catch (MyDataArrayException ex) {
            ex.printStackTrace();
            System.out.println("Matrix does have broken value. Please check it.");
        }
        return 0;
    }

}