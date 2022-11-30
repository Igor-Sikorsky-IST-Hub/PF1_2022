public class task4_2 {

    public static void main(String[] args) {

        printResults(new float[] {0.000023f, 3.5f, 4.3f, 5.3f, 7.1f, 9.3f, 6.3f, 4.12f});
        printResults(new float[] {131342342675434876284345423523f, 3.2f,});
        printResults(new float[] {1.423f, 2.5435f, 42.5564f, 6345.3f, 4.3421f, 7.234234f});
        printResults(new float[] {0.4234f, -3.12312f, -443.242f, -6.4325345f, -99.3f});
        printResults(new float[] {1.42f, 2432.324f});
        printResults(new float[] {});
    }

    public static float[] selectionsort(float[] sortedArr){
        for (int i = 0; i < sortedArr.length; i++) {
            int pos = i;
            float min = sortedArr[i];
            for (int j = i + 1; j < sortedArr.length; j++) {
                if (sortedArr[j] > min) {
                    pos = j;
                    min = sortedArr[j];
                }
            }
            sortedArr[pos] = sortedArr[i];
            sortedArr[i] = min;
        }
        if (sortedArr.length == 0){
            throw new IllegalArgumentException("Нічого сортувати(");
        }
        return sortedArr;
    }

    static void printResults(float[] array) {
        System.out.println();
        try {
            float[] help = (selectionsort(array));
            for (int i = 0; i < array.length; i++){
                System.out.print(array[i] + ", ");
                if (i == array.length-1) System.out.println();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("EXEPTION " + e.getMessage());
        }
    }

}