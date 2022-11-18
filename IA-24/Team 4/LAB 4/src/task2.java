import java.lang.Math;

public class task2 {
    public static void main(String[] args) {
        int[] array1 = { 1, -14, -1, 17 };
        int[] array2 = { 1, 20, -14, -1, -3, 17 };
        int[] array3 = { 1, 3, -14, -1, -3, 17, -5, -19 };
        System.out.println("Найбільший елемент має номер: " +
                task(array1));
        System.out.println("Найбільший елемент має номер: " +
                task(array2));
        System.out.println("Найбільший елемент має номер: " +
                task(array3));
    }

    // Знайти номер найбільшого за модулем елемента масиву
    public static int task(int[] array) {
        int position = 0;
        int theLargestElement = 0;
        for (int i = 0; i < array.length; i++) {
            if (Math.abs(array[i]) > theLargestElement) {
                theLargestElement = array[i];
                position = i;
            }
        }
        return position;
    }
}
