public class BubbleSort implements ISortStrategy {
    public void Sort(float[] array){
        for (int i=0;i<array.length-1;++i){

            for(int j=0;j<array.length-i-1; ++j){

                if(array[j+1]>array[j]){

                    float swap = array[j];
                    array[j] = array[j+1];
                    array[j+1] = swap;

                }
            }
        }
        System.out.println("Вiдбулося сортування бульбашкою");
    }
}
