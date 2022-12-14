public class BubbleSort implements ISort {
    @Override
    public void sort(byte[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr.length - 1; k++) {
                if (arr[k] > arr[k + 1]) {
                    byte temp = arr[k + 1];
                    arr[k + 1] = arr[k];
                    arr[k] = temp;
                }
            }
        }
    }
}
