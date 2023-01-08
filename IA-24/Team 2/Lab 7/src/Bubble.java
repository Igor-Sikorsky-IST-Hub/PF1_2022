import java.util.Arrays;
public class Bubble implements Sorting {
    @Override
    public void sort(short[] array) {
        System.out.println("Array before bubbleSorting:" + Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] > array[j]) {
                    short swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }
        }
        if (array.length == 0) {
            throw new IllegalArgumentException("Нічого сортувати");
        }
        System.out.println("Array after bubbleSorting:" + Arrays.toString(array));
    }
}