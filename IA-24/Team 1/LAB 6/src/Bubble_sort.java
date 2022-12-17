import java.util.Arrays;
public class Bubble_sort {
    public static void main(String[] args) {
        printResults(new byte[]{1, 25, -3, 4, 5});
        printResults(new byte[]{1, 13, 2, 8, -10, 3, 5, 4, 3});
        printResults(new byte[]{2, -20, 53, 6, 31, 2, 9,});
        printResults(new byte[]{1, 43, 0, 4, -36, -7, 7, 7});
        printResults(new byte[]{-26, -33, -20});
        printResults(new byte[]{});
    }
    public static byte[] bubbleSort(byte[] arr) {
        byte k;
        boolean sort = false;
        if(arr.length == 0){
            throw new IllegalArgumentException("Can't handle zero-length arrays.");
        } else {
            while (!sort) {
                sort = true;
                for (int j = 0; j < arr.length-1; j++) {
                    if (arr[j] > arr[j+1]) {
                        sort = false;
                        k = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = k;
                    }
                }
            }
        }
        return arr;
    }
    static void printResults(byte[] arr) {
        System.out.print("Arrays:" + Arrays.toString(arr) + " results:");
        try {
            System.out.println(Arrays.toString(bubbleSort(arr)));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}
