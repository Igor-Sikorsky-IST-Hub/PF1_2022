public class SelectionSorting implements SortingType {
    @Override
    public void sort(long[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }

            }
            long temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
