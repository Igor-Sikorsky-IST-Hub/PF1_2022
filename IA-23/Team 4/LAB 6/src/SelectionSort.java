public class SelectionSort {
    public static float[] selectionSort(float[] array) {
        //float[] array = {12.4f, 45.545f, 23.2f, 22.434f, 43.32f, 643.42f, 22.41344f};
        for (int min = 0; min < array.length; min++) {
            int least = min;
            for (int j = min + 1; j < array.length; j++) {
                if (array[min] < array[j]) {
                    least = j;
                }
            }
            float tempNum = array[min];
            array[min] = array[least];
            array[least] = tempNum;
        }
        return array;
    }

    public static void main(String[] args) {
        float[] array = {12.4f, 45.54f, 23.2f, 22.43f, 43.32f, 643.42f};
        for (float i : selectionSort(array)) {
            System.out.println(i);
        }
    }
}