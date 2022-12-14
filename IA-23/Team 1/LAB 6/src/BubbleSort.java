public class BubbleSort {

    public static void main(String[] args) {
        byte[] arr = {5, -1, 3, 4, -6};
        System.out.println("Array before bubble sort: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }

        System.out.println();
        bubbleSort(arr);

        System.out.println("Array after bubble sort");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }

    public static void bubbleSort(byte[] arr) {
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