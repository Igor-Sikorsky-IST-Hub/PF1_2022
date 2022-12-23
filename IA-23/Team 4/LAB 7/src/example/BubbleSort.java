package example;

public class BubbleSort implements Strategy{

    @Override
    public void sort(float[] array) {
        int j =0;
        while (j< array.length){
            for(int i =1; i < array.length; i++){
                if (array[i]>array[i-1]){
                    float temporary = array[i];
                    array[i] = array[i-1];
                    array[i-1] = temporary;
                }
            }
            j++;
        }
    }
}

