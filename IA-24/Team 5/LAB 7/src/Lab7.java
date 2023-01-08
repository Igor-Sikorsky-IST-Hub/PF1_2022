import java.util.Arrays;
public class Lab7 {
    public static void main(String[] args) {
        Strategy c = new Strategy();
        double[] a = {11.5, -3, -5.2, 2, 5, 6};
        c.setStrategy(new SelectionSort());
        c.sorterStrategy(a);
        double[] b = {10, 13.4, -17, -1, 5};
        c.setStrategy(new BubbleSort());
        c.sorterStrategy(b);
        double[] d = {-1, -5, -7, 10.1, 10.2, 2};
        c.setStrategy(new InsertionSort());
        c.sorterStrategy(d);
    }

    static class Strategy {
        Sorting strategy;

        public void setStrategy(Sorting strategy) {

            this.strategy = strategy;
        }

        public void sorterStrategy(double[] arr) {
            strategy.sort(arr);
        }
    }

    interface Sorting {
        void sort(double[] arr);
    }

    static class SelectionSort implements Sorting {
        public void sort(double[] arr) {
            System.out.println("SelectionSort");
            System.out.println("before: " + Arrays.toString(arr));
            for (int i = 0; i < arr.length - 1; i++) {
                int min = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[min]) {
                        min = j;
                    }
                }
                double a = arr[min];
                arr[min] = arr[i];
                arr[i] = a;
            }
            System.out.println("after: " + Arrays.toString(arr));
        }
    }

    static class BubbleSort implements Sorting {
        public void sort(double[] arr) {
            System.out.println("BubbleSort");
            System.out.println("before: " + Arrays.toString(arr));
            for (int i = 0; i < arr.length - 1; i++)
                for (int j = 0; j < arr.length - i - 1; j++)
                    if (arr[j] > arr[j + 1]) {
                        double temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
            System.out.println("after: " + Arrays.toString(arr));
        }
    }

    static class InsertionSort implements Sorting{
        public void sort(double[] arr) {
            System.out.println("InsertionSort");
            System.out.println("before: " + Arrays.toString(arr));
            for (int i = 1; i < arr.length; ++i) {
                double c = arr[i];
                int j = i - 1;
                while (j >= 0 && arr[j] > c) {
                    arr[j + 1] = arr[j];
                    arr[j] = c;
                    --j;
                }
            }
            System.out.println("after: " + Arrays.toString(arr));
        }
    }
}