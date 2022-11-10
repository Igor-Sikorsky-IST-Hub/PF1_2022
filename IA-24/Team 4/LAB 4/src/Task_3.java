import java.util.Arrays;

public class Task_3 {

    public static void main(String[] args) {
        printResults(null);
        printResults(new int[] {});
        printResults(new int[] {-4, 0, 0, 5, 3, 1, -6});
        printResults(new int[] {4, 2, 1, 5, 7, 0, -3, -8, 0});
    }

    public static int[] change_array(int[] array) {
        if (array == null) {
            throw new NullPointerException("Array shouldn't be null!");
        } else if (array.length < 1){
            throw new IndexOutOfBoundsException("Array shouldn't be empty!");
        }
        int[] changed_array = new int[array.length];
        for (int i = 0; i < array.length; i++){
            if (array[i] < 0) {
                changed_array[i] = array[i] * -1;
            } else if (array[i] > 0) {
                changed_array[i] = array[i] - 3;
            } else {
                changed_array[i] = -2;
            }
        }
        return changed_array;
    }

    public static void printResults(int[] array) {
        if (array != null) {
            System.out.print("array: " + Arrays.toString(array) + " result: ");
        } else {
            System.out.print("array: " + array + " result: ");
        }
        try {
            System.out.println(Arrays.toString(change_array(array)));
        } catch (NullPointerException | IndexOutOfBoundsException ex) {
            System.out.println("!Exception! " + ex.getMessage());
        }
    }
}
