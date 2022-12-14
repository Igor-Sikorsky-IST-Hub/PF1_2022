package op.lab;


public class Lab6_insertion {
    public static void main(String[] args) {
        printResults(new long[]{Long.MAX_VALUE, 54, 321, 17, 9});
        printResults(new long[]{15, 1, 3, 78, 98});
        printResults(new long[]{456, 321});
        printResults(new long[]{122, 2, 564, 56, 4, 5, 68, -89});
    }


    private static void printResults(long[] array) {
        System.out.println("Insertion sort : ");
        try {
            long[] sortedArray = (insertionSort(array));
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
                if (i == array.length - 1) System.out.println();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Увага " + e.getMessage());
        }
    }

    static long[] insertionSort(long[] array) {
        for (long l : array) {
            if (l == Long.MAX_VALUE | l == Long.MIN_VALUE) {
                throw new IllegalArgumentException("Недопустимий елемент = " + l);
            }
        }
        for (int j = 1; j < array.length; ++j) {
            long temp = array[j];
            int i = j - 1;
            while (i >= 0 && array[i] > temp) {
                array[i + 1] = array[i];
                i = i - 1;
            }
            array[i + 1] = temp;
        }
        return array;
    }

}