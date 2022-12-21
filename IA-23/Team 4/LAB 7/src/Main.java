import java.util.Arrays;
public class Main {

    public static void swap (float[] array, int i, int j){
        float temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static int partition(float[] a, int start, int end){
        float pivot = a[end];
        int pIndex = start;
        for (int i=start; i<end; i++){
            if (a[i]<= pivot){
                swap(a,i,pIndex);
                pIndex++;
            }
        }
        swap(a,end,pIndex);
        return pIndex;
    }
    public static void quicksort(float[] a, int start, int end){
        if (start>=end){
            return;
        }
        int pivot = partition(a, start, end);
        quicksort(a, start, pivot-1);
        quicksort(a,pivot+1,end);
    }

    public static void main(String[] args) {
        float[] a = {9.01f, -3.12f, 5f, 2.1568f, 6.56879f, 8f, -6.9465f, -6.16198f, 1f, 3.59f};
        quicksort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
}