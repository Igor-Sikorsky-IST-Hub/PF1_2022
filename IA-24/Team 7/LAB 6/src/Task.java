public class Task {
    public static void main(String[] args) {
        printResults(new short[]{Short.MAX_VALUE, 123, 54});
        printResults(new short[]{97, 465, 32, 79, 9887});
        printResults(new short[]{125, 8979, 687});

    }


    private static double printResults(short[] array) {
        System.out.println("Bubble sort  : ");
        try {
            short[] sortedArray = (bubbleSort(array));
            for (short i : array) {
                System.out.print(i + " ");
            }
            System.out.println();
        } catch (IllegalArgumentException e) {
            System.out.println("Увага " + e.getMessage());
        }
        return 0;
    }

    static short[] bubbleSort(short[] array) {
        short[] sortedArray = new short[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == Short.MAX_VALUE) {
                throw new IllegalArgumentException("Недопустимий елемент = " + array[i]);
            }
        }
        boolean sorted = false;
        while (sorted == false) {
            for (int j = 1; j < array.length; j++) {
                sorted = true;
                for (int i = 1; i < array.length; i++) {
                    if (array[i] < array[i - 1]) {
                        short temp = array[i];
                        array[i] = array[i - 1];
                        array[i - 1] = temp;
                        sorted = false;
                    }
                }
            }
        }
        return sortedArray;
    }
}
