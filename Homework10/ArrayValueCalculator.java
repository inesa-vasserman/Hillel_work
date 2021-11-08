package Homework10;


public class ArrayValueCalculator {

    public int doCalc(String[][] values) {
        checkArraySize(values);

        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length; j++) {
                try {
                    sum += Integer.parseInt(values[i][j]);
                } catch (NumberFormatException ex) {
                    throw new MyDataArrayException(
                            String.format("Array cell [%s][%s] does not contain parseable integer", i, j),
                            ex
                    );
                }
            }
        }

        return sum;
    }

    private void checkArraySize(String[][] values) {
        checkArraySize(values.length);

        for (String[] value : values) {
            checkArraySize(value.length);
        }
    }

    private void checkArraySize(int length) {
        if (length != 4) {
            throw new MyArraySizeException("Array must be 4x4.");
        }
    }

}