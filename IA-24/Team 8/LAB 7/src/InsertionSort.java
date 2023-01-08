package lab7;

import java.util.Arrays;
public class InsertionSort implements Sorting{
    @Override
    public long[] sortSomething(long[] array) {
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
    @Override
    public void printResult(long[] array) {
        String result = Arrays.toString(sortSomething(array));
        System.out.println("Sorted array: " + result);
    }
}
