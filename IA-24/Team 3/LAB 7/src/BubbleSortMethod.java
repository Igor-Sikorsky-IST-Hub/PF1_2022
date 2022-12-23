package strategy;

public class BubbleSortMethod implements Method {
    @Override
    public long[] sort(long[] array) {
        long[] sortedArray = new long[array.length];
        for (long l : array) {
            if (l == Long.MAX_VALUE | l == Long.MIN_VALUE) {
                throw new IllegalArgumentException("Недопустимий елемент = " + l);
            }
        }
        for (int i = 1; i < array.length; i++){
            if (array[i] < array[i - 1]) {
                long trm = array[i];
                array[i]=array[i-1];
                array[i-1]=trm;
                if (i == array.length - 1) {
                    return sortedArray;
                }
            }

        }
        return sortedArray;
    }
}
