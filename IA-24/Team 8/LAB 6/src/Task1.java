package lab6;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        long[] array = {1029372289, 426491321, 9238422, 9238422, 2107846362, 3267843, 52, 10982347};

        System.out.println("Array sorted using selection sort:" + Arrays.toString(selectionSort(array)));
        System.out.println("Array sorted using incertion sort:" + Arrays.toString(insertionSort(array)));
    }
    public static long[] selectionSort(long[] array) {
        //Inserting max element in its place for each iteration
        for (int maxIndex = 0; maxIndex < array.length; maxIndex++) {
            long maxValue = array[maxIndex];

            int maxIndexLocal = maxIndex;
            long maxValueLocal = maxValue;
            //Selecting element with max value for present iteration
            for (int i = maxIndexLocal + 1; i < array.length; i++) {
                if (array[i] > array[maxIndexLocal]) {
                    maxValueLocal = array[i];
                    maxIndexLocal = i;
                }
            }
            array[maxIndex] = maxValueLocal;
            array[maxIndexLocal] = maxValue;
        }
        return array;
    }
    public static long[] insertionSort(long[] array) {
        // Selecting an element to sort
        for (int i = 1; i < array.length; i++) {
            // Checking all cases
            if (array[i] > array[0]) {
                // Inserting an element in its place; shifting other elements
                long temVar;
                temVar = array[i];
                for (int j = 0; j < (i - 1); j++) {
                    array[i - j] = array[i - j - 1];
                }
                array[0] = temVar;
            }
            else {
                // Finding the correct location of the element
                for (int k = 0; k < (i - 1); k++) {
                    if (array[k] > array[i] && array[i] > array[k + 1]) {
                        // Inserting an element in its place; shifting other elements
                        long temVar;
                        temVar = array[i];
                        for (int j = 0; j < (i - k - 1); j++) {
                            array[i - j] = array[i - j - 1];
                        }
                        array[k + 1] = temVar;
                    }
                }
            }
        }
        return array;
    }
}
