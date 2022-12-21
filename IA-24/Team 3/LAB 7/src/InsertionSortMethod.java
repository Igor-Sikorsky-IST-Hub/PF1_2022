package strategy;

public class InsertionSortMethod implements  Method {
    @Override
    public long[] sort(long[] array) {
        for (long l : array) {
            if (l == Long.MAX_VALUE | l == Long.MIN_VALUE) {
                throw new IllegalArgumentException("Недопустимий елемент = " + l);
            }
        }
        for (int j = 1; j < array.length; ++j) {
            long temp = array[j];
            int i = j - 1;
            while (i >= 0 && array[i] > temp) {
                array[i + 1] = array[i];
                i = i - 1;
            }
            array[i + 1] = temp;
        }
        return array;
    }
}
