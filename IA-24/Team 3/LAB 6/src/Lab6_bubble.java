package op.lab;

public class Lab6_bubble {
    public static void main(String[] args) {
        printResults(new long[]{122, 2, 564, 56, 4, 5, 68, -89});
        printResults(new long[]{Long.MAX_VALUE, 54, 321, 17, 9});
        printResults(new long[]{15, 1, 3, 78, 98});
        printResults(new long[]{456, 321});

    }

    private static void printResults(long[] array) {
        System.out.println("Bubble sort  : ");
        try {
            long[] sortedArray = (bubbleSort(array));
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
                if (i == array.length - 1) System.out.println();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Увага " + e.getMessage());
        }
    }

    static long[] bubbleSort(long[] array) {
        long[] sortedArray = new long[array.length];
        for (long l : array) {
            if (l == Long.MAX_VALUE | l == Long.MIN_VALUE) {
                throw new IllegalArgumentException("Недопустимий елемент = " + l);
            }
        }
        boolean isSorted = false;
        while (!isSorted) {
            for (int j = 1; j < array.length; j++) {
                int k=0;
                for (int i = 1; i < array.length; i++) {
                    if (array[i] < array[i - 1]) {
                        long temp = array[i];
                        array[i] = array[i - 1];
                        array[i - 1] = temp;
                        k=1;
                    }
                }
                if (k==0) isSorted = true;
            }
        }
        return sortedArray;
    }
}
