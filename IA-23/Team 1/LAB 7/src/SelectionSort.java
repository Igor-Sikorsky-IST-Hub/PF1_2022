public class SelectionSort implements ISort {
    @Override
    public void sort(byte[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[index] > arr[j]) {
                    index = j;
                }
            }

            byte smallestValue = arr[index];
            arr[index] = arr[i];
            arr[i] = smallestValue;
        }
    }
}
