package example;

public class SelectionSort implements Strategy{

    @Override
    public void sort(float[] array){
        for (int min = 0; min < array.length-1; min++) {
            int least = min;
            for (int j = min + 1; j < array.length; j++) {
                if (array[least] < array[j]) {
                    least = j;
                }
            }
            float tempNum = array[min];
            array[min] = array[least];
            array[least] = tempNum;
        }
    }
}
