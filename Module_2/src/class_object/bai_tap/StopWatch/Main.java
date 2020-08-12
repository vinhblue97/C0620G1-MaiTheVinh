package class_object.bai_tap.StopWatch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        double[] array = new double[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * 1000;
        }
        System.out.println("Time now: " + watch.getStartTime());
        Arrays.sort(array);
        System.out.println("Time now: " + watch.getStopTime());
        System.out.print("Time need to sort: " + watch.getElapsedTime());
    }
}
