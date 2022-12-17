public class BubbleSorting implements SortingType {
    @Override
    public void sort(long[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    long buff = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buff;
                    isSorted = false;
                }
            }
        }
    }
}
