package strategy;

import java.util.Arrays;

public class SortMethodRunner {
    public static void main(String[] args) {
        SortMethod sortMethod = new SortMethod();

        sortMethod.setMethod(new BubbleSortMethod());
        printResult(sortMethod, new long[]{12, 1, 3});

        sortMethod.setMethod(new InsertionSortMethod());
        printResult(sortMethod, new long[]{Long.MAX_VALUE, 54, 321, 17, 9});
    }

    public static void printResult(SortMethod sortMethod, long[] array) {
        try {
            System.out.println(Arrays.toString(sortMethod.executeMethod(array)));
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
