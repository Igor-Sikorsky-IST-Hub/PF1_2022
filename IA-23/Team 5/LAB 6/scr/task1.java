import java.util.Arrays;

public class task1 {
        static void selection_sort(double[] arr) {
            int n = arr.length;
            for (int i = 0; i < n-1; i++)
            {
                int min = i;
                for (int j = i+1; j < n; j++)
                    if (arr[j] < arr[min])
                        min = j;
                double result = arr[min];
                arr[min] = arr[i];
                arr[i] = result;

            }
        }
        public static void main(String[] args) {

            double[] arr = {64,8.05,0.05,0.009,25,12,22,11};
            System.out.println("Non-sorted: " + Arrays.toString(arr));
            selection_sort(arr);
            System.out.println("Sorted: " + Arrays.toString(arr));
            double[] another = {0.07,205,100,1000000000,0.000000008};
            System.out.println("Non-sorted: " + Arrays.toString(another));
            selection_sort(another);
            System.out.println("Sorted: " + Arrays.toString(another));
        }
}

