//Bubble and Insertion sort float array in descending order

public class BubbleSort {
    public static void main(String[] args) {

        float[] array = {3.3F, 8.75F, 8.76F, 2.02F, 0.1F};

        System.out.println("Bubble sorted array: ");
        for (int i = 0; i < array.length; i++) {
            bubbleSort(array);
            System.out.print(array[i] + ", ");


        }
    }

    static void bubbleSort(float[] array) {
        float newArray;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length - 1); j++) {
                if (array[j - 1] < array[j]) {
                    newArray = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = newArray;
                }
            }
        }
    }
}
