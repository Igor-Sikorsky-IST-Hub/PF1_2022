package example;

public class InsertionSort implements Strategy {
    @Override
    public void sort(float[] array) {
        for (int j = 1; j < array.length; j++) {
            float tempNum = array[j];
            int i = j - 1;
            while (i >= 0 && array[i] < tempNum) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = tempNum;
        }
    }
}
