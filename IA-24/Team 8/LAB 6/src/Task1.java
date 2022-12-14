package lab6;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        long[] array = {1029372289, 426491321, 9238422, 2107846362, 3267843, 52, 10982347};
        long[] array2 = {1029372289, 426491321, 9238422, 2107846362, 3267843, 51, 10982347};

        System.out.println("Array sorted using selection sort:" + Arrays.toString(selectionSort(array)));
        System.out.println("Array sorted using insertion sort:" + Arrays.toString(insertionSort(array2)));
    }
    public static long[] selectionSort(long[] array) {
        // Inserting max element in its place for each iteration
        for (int maxIndex = 0; maxIndex < array.length; maxIndex++) {
            long maxValue = array[maxIndex];

            int maxIndexLocal = maxIndex;
            long maxValueLocal = maxValue;
            // Selecting an element with max value for present iteration
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
        // Selecting ab element for sorting
        for (int i = 1; i < array.length; i++) {
            long temVar = array[i];
            int location = i - 1;
            // Finding a place for the element and inserting
            while (location >= 0 && array[location] < temVar) {
                array[location + 1] = array[location];
                location -= 1;
            }
            array[location + 1] = temVar;
        }
        return array;
    }
}




