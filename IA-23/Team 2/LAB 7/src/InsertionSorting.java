public class InsertionSorting implements Strategy {
    @Override
    public void sort(short[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current > array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = (short) current;
        }
    }
}

