import java.util.Arrays;
public class Insertion_sort implements Sorting{
    @Override
    public long[] sortSomething(long[] array) {
        for (int i = 1; i < array.length; i++) {
            long temVar = array[i];
            int location = i - 1;
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
        System.out.println("Відсортований масив: " + result);
    }
}
