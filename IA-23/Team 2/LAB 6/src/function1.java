public class function1 {
    //пишемо функцію для сортування масиву методом вибору
    public static void Sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int maxa = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > min) {
                    min = array[j];
                    maxa = j;
                }
            }
            // заміна елементів
            int chang = array[i];
            array[i] = min;
            array[maxa] = chang;
        }
    }

    //пишемо масив і виконуємо функцію сортування над масивом
    public static void main(String args[]) {
        int[] Array = {7, 6, 4, 9, 11, 12, 17, 2};
        Sort(Array);
        for(int i = 0; i < Array.length; i++) {

            //виводимо результат
            System.out.print(Array[i] + "\n");
        }
    }
}

