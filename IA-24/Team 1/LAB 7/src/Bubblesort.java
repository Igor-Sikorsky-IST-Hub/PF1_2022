public class Bubblesort implements Strategy{
    public byte[] sort(byte[] arr) {
        byte k;
        boolean sort = false;
        if (arr.length == 0) {
            throw new IllegalArgumentException("Can't handle zero-length arrays.");
        } else {
            while (!sort) {
                sort = true;
                for (int j = 0; j < arr.length - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        sort = false;
                        k = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = k;
                    }
                }
            }
        }
        return arr;
    }
}