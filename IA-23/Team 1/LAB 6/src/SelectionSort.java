public class SelectionSort {

    public static void main(String[] args) {
        byte[] arr = {5, -1, 3, 4, -6};
        System.out.println("Array before sort: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }

        System.out.println();
        selectionSort(arr);

        System.out.println("Array after sort");
        for (int value : arr) {
            System.out.print(value + " ");
    }
}
    public static void selectionSort(byte[] arr) {
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
