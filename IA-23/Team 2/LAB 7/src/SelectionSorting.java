public class SelectionSorting implements Strategy{
    @Override
    public void sort(short[] array){
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    min = j;
                }
            }
            short temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}

