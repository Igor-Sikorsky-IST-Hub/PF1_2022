import java.util.Arrays;
public class Selection implements Sorting {

    @Override
    public void sort(short[] array) {
        System.out.println("Array before selectionSorting:" + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            int pos = i;
            short min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > min) {
                    pos = j;
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;
        }
        if (array.length == 0) {
            throw new IllegalArgumentException("Нічого сортувати");
        }
        System.out.println("Array after selectionSorting:" + Arrays.toString(array));

    }
}