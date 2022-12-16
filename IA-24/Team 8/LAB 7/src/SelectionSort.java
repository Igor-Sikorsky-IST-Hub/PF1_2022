package lab7;

import java.util.Arrays;
public class SelectionSort implements Sorting{
    @Override
    public long[] sortSomething(long[] array) {
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
    @Override
    public void printResult(long[] array) {
        String result = Arrays.toString(sortSomething(array));
        System.out.println("Sorted array: " + result);
    }
}
