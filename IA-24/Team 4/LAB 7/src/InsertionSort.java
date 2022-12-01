public class InsertionSort implements ISortStrategy {
    public void Sort(float[] array) {
        for (int i = 0; i < array.length; i++){
            float temp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] < temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
        System.out.println("Вiдбулося сортування Включенням");
    }
}
