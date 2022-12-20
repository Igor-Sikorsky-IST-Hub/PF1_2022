import java.util.Arrays;
public class Insertion implements Sorting {

    @Override
    public void sort(short[] array) {
        System.out.println("Array before insertionSorting:" + Arrays.toString(array));
        if (array.length == 0) {
            throw new IllegalArgumentException("Нічого сортувати");
        }
        int j;
        for (int i = 1; i < array.length; i++) {
            short swap = array[i];
            for (j = i; (j > 0) && (array[j - 1] < swap); j--) {
                array[j] = array[j - 1];
            }
            array[j] = swap;
        }


        System.out.println("Array after insertionSorting:" + Arrays.toString(array));
    }
}