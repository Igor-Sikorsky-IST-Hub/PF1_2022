import java.util.Arrays;
public class Bubble_sort implements Sorting{
    @Override
    public long[] sortSomething(long[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    long temVar = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temVar;
                }
            }
        }
        return array;
    }
    @Override
    public void printResult(long[] array) {
        String result = Arrays.toString(sortSomething(array));
        System.out.println("Відсортований масив: " + result);
    }
}