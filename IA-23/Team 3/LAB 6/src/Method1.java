import java.util.Arrays;

public class Method1 {
    public static void main(String[] args) {
        printSortedArray(new long[]{1, 6, 3, 6, 3, 8, 0, 19});
        printSortedArray(null);

    }

    public static long[] insertionSort(long[] inArray){
        if (inArray == null) {
            throw new NullPointerException("Array is not defined");
        }
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


    public static void printSortedArray(long[] inArray) {
        try {
            long[] sortedArray = insertionSort(inArray);
            System.out.print(Colors.ANSI_GREEN + "Sorted array: " + Colors.ANSI_RESET);
            for (long number: sortedArray) {System.out.print(number + " ");}
            System.out.println();
        } catch (NullPointerException e) {
            System.out.print(Colors.ANSI_RED + "EXCEPTION! " + Colors.ANSI_RESET + e.getMessage());
        }
    }
}