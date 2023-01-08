import java.util.Arrays;
public class Task1 {
    public static void main(String[] args) {
        long[] a = {13000, 44230, 32899, 19567, 56798, 52345, 12345};
        long[] b = {642795, 458702, 564709, 475802, 542987, 514532, 785489};

        System.out.println("Масив відсортовано за допомогою selection sort:" + Arrays.toString(selectionSort(a)));
        System.out.println("Масив відсортовано за допомогою insertion sort:" + Arrays.toString(insertionSort(b)));
    }
    public static long[] selectionSort(long[] array) {
        for (int maxIndex = 0; maxIndex < array.length; maxIndex++) {
            long maxValue = array[maxIndex];

            int maxIndexLocal = maxIndex;
            long maxValueLocal = maxValue;
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
}
