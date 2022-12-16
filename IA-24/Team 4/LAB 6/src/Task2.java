public class Task2 {
    public static void main(String[] args) {
        float[] sortArr = {15.23f, 3.54f, 4.893f, 15.229f, 16.32f, 11.73f};
        selectionSort(sortArr);
        printArray(sortArr);
    }
    public static void selectionSort(float[] sortArr) {
        for (int i = 0; i < sortArr.length; i++) {
            int pos = i;
            float max = sortArr[i];
            //цикл вибору найменшого елемента
            for (int j = i + 1; j < sortArr.length; j++) {
                if (sortArr[j] > max) {
                    //pos - індекс найменшого елемкнта
                    pos = j;
                    max = sortArr[j];
                }
            }
            sortArr[pos] = sortArr[i];
            //міняємо місцями з найменшим sortArr[i]
            sortArr[i] = max;
        }
    }
    public static void printArray(float[] arr){
        for (float j : arr) {
            System.out.print(j + " ");
        }
    }
}
