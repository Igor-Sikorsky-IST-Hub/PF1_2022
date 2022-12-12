public class Task2 {
    public static void main(String[] args) {

        printResults(new short[] {3, 43, -67, 78, 0});
        printResults(new short[] {8, 0, 9, 99, 23});
        printResults(new short[] {78, -78, 1, 11, -11});
        printResults(new short[] {56, 53, 5, 35});
        printResults(new short[] {1, -1, 89, -89});
        printResults(new short[] {});
    }

    public static short[] insertionSort(short[] sortedArr){
        for (int i = 0; i < sortedArr.length - 1; i++) {
            for(int j = 0; j < sortedArr.length - i - 1; j++) {
                if(sortedArr[j + 1] > sortedArr[j]) {
                    short temp = sortedArr[j];
                    sortedArr[j] = sortedArr[j + 1];
                    sortedArr[j + 1] = temp;
                }
            }
        }
        if (sortedArr.length == 0){
            throw new IllegalArgumentException("Нічого сортувати(");
        }



        return sortedArr;
    }

    static void printResults(short[] array) {
        System.out.println();
        try {
            short[] help = (insertionSort(array));
            for (int i = 0; i < array.length; i++){
                System.out.print(array[i] + ", ");
                if (i == array.length-1) System.out.println();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("EXEPTION " + e.getMessage());
        }
    }
}
