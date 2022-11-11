import java.util.Arrays;
public class InsertionSort {
    public static void main(String[] args) {
        printSortedArray(randomLongArray(0, 100, 10));
        printSortedArray(randomLongArray(5, 3, 10));
        printSortedArray(randomLongArray(2, 5, 0));
        printSortedArray(randomLongArray(2, 5, -6));
        printSortedArray(randomLongArray(0, 100, Integer.MAX_VALUE));
    }

    public static long[] insertionSort(long[] inArray) {
        long[] outArray = Arrays.copyOf(inArray, inArray.length);
        for (int i = 1; i < outArray.length; i++) {
            int j = i;
            while ((j > 0) && (outArray[j - 1] > outArray[j])) {
                long buffer = outArray[j];
                outArray[j] = outArray[j - 1];
                outArray[j - 1] = buffer;
                j--;
            }
        }
        return outArray;
    }

    public static long[] randomLongArray(long minValue, long maxValue, int arrayLength) {
        try {
            long[] randomArray = new long[arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                randomArray[i] = minValue + (long) (Math.random() * (maxValue + 1 - minValue));
            }
            return randomArray;
        } catch (OutOfMemoryError | IllegalArgumentException | NegativeArraySizeException e) {
            System.out.println(Colors.ANSI_RED + "Exception: " + Colors.ANSI_RESET + "It's impossible to implement an array with this length");
            return null;
        }
    }

    public static void printSortedArray(long[] inArray) {
        if (inArray != null) {
            long[] sortedArray = insertionSort(inArray);
            System.out.print(Colors.ANSI_GREEN + "Sorted array: " + Colors.ANSI_RESET);
            for (long number : sortedArray) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
