public class InsertionSort implements ISort {
    @Override
    public void sort(byte[] arr) {
        for (int i = 0; i < arr.length; i++) {

            byte temp = arr[i];
            int j = i - 1;

            for ( ;(j > -1) && (arr[j] > temp); j--) {
                arr[j + 1] = arr[j];
            }

            arr[j + 1] = temp;
        }

    }
}
