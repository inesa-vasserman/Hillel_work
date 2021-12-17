package Homework17;

import java.util.Arrays;


public class ValueCalculator {

    private static final int SIZE = 100000000;
    private static final int HALF = SIZE / 2;

    private final float[] arr = new float[SIZE];

    public void doCalc() {
        long start = System.currentTimeMillis();
        Arrays.fill(arr, 2);

        float[] source1 = new float[HALF];
        float[] source2 = new float[HALF];

        System.arraycopy(arr, 0, source1, 0, HALF);
        System.arraycopy(arr, HALF, source2, 0, HALF);

        Thread t0 = new Thread(getCalcOperation(source1));
        Thread t1 = new Thread(getCalcOperation(source2));

        t0.start();
        t1.start();

        try {
            t0.join();
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(source1, 0, arr, 0, HALF);
        System.arraycopy(source2, 0, arr, HALF, HALF);

        long end = System.currentTimeMillis() - start;

        System.out.println("Operation took: " + end);
    }

    private Runnable getCalcOperation(float[] arr) {
        return new Runnable() {
            @Override
            public void run() {
                doCalc(arr);
            }
        };
    }

    private void doCalc(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

}
