public class function2 {
    //пишемо функцію для сортування масиву методом вставки
    public static void Sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && current > array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }
    //записуємо сам масив і виконуємо функцію сортування
    public static void main(String args[]) {
        int[] Array = {7, 6, 4, 9, 11, 12, 17, 2};
        Sort(Array);
        for(int i = 0; i < Array.length; i++) {

            //виводимо результат
            System.out.print(Array[i] + "\n");
        }
    }

}

