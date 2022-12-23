import java.util.Arrays;

public class Selection_sort {
    public static void main(String[] args) {
        printResults(new byte[]{1, 25, -3, 4, 5});
        printResults(new byte[]{1, 13, 2, 8, -10, 3, 5, 4, 3});
        printResults(new byte[]{2, -20, 53, 6, 31, 2, 9,});
        printResults(new byte[]{1, 43, 0, 4, -36, -7, 7, 7});
        printResults(new byte[]{-26, -33, -20});
        printResults(new byte[]{});
    }

    public static byte[] selectionSort(byte[] arr) {
        for (int i = 0; i < (arr.length - 1); i++) {
            int min_idx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            byte temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    static void printResults(byte[] arr) {
        if(arr == null){throw new NullPointerException("Can't handle null arrays");}
        if(arr.length == 0){throw new IllegalArgumentException("Can't handle zero-length arrays.");}
        else {System.out.print("Arrays:" + Arrays.toString(arr) + " results:");
            System.out.println(Arrays.toString(selectionSort(arr)));}
        }
    }
