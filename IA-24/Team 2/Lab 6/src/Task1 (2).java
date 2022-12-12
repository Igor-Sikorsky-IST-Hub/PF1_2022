public class Task1 {
    public static void main(String[] args) {

        printResults(new short[] {89, 32,-32, 0, 11, 9});
        printResults(new short[] {43, 53, -11, 43, 89});
        printResults(new short[] {76, 78, -79, 100});
        printResults(new short[] {111, -100, 127, 1});
        printResults(new short[] {0, -1, 43, 84});
        printResults(new short[] {});
    }

    public static short[] selectionsort(short[] sortedArr){
        for (int i = 0; i < sortedArr.length; i++) {
            int pos = i;
            short min = sortedArr[i];
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

    static void printResults(short[] array) {
        System.out.println();
        try {
            short[] help = (selectionsort(array));
            for (int i = 0; i < array.length; i++){
                System.out.print(array[i] + ", ");
                if (i == array.length-1) System.out.println();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("EXEPTION " + e.getMessage());
        }
    }
}
