import java.util.Arrays;
public class task2{
    static void insertion_sort(double[] arr)
    {
        int n = arr.length;
        for (int k = 1; k < n; ++k) {
            double key = arr[k];
            int i = k - 1;
            while (i >= 0 && arr[i] > key) {
                arr[i + 1] = arr[i];
                i = i - 1;
            }
            arr[i + 1] = key;
        }
    }

    public static void main(String[] args) {
        double[] arr = { 12, 11, 13, 5, 6 ,5.01, 6.05};
        System.out.println("Non-sorted: " + Arrays.toString(arr));
        insertion_sort(arr);
        System.out.println("Sorted: " + Arrays.toString(arr));
        double[] another = { 10.6,11,1.89,105.98,0.85,0.008};
        System.out.println("Non-sorted: " + Arrays.toString(another));
        insertion_sort(another);
        System.out.println("Sorted: " + Arrays.toString(another));

    }
}
