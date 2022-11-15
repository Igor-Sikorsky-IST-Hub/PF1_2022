package lab4;

public class lab6_bubble {
    public static void main(String[] args) {
        printResults(new long[] {5, 1, 0, 2, 8, 1});
        printResults(new long[] {101, 100004, 9284976, 12323, -12415, -356});
        printResults(new long[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0});
        printResults(new long[] {1, 2, 3});
    }

    public static void bubbleSort(long[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    long buff = array[i];
                    array[i]=array[i-1];
                    array[i-1]=buff;
                    isSorted=false;
                }
            }
        }
    }

    public static void printResults(long[] array) {
        if (array != null) {
            System.out.print("Array: ");
            for (long element : array) {
                System.out.print(element + " ");
            }
            System.out.println();
            System.out.print("Sorted array:");
            bubbleSort(array);
            for (long element : array) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
