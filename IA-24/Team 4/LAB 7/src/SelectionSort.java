public class SelectionSort implements ISortStrategy {
    public void Sort(float[] array){
        for (int i = 0; i < array.length-1; i++) {
            int min_idx = i;
            for (int j = i+1; j < array.length; j++)
                if (array[j] > array[min_idx])
                    min_idx = j;

            float temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
        System.out.println("Вiдбулося сортування вибором");
    }
}
