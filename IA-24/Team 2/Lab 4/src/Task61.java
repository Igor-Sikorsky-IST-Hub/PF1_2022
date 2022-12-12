import java.util.Arrays;

class Task61 {
    public static void main(String[] args) {
        printResults(new int[]{1, 3, 4, 6, 5}, new int[]{2, 4, 6, 2, 1});
        printResults(new int[]{-1,-3,-5},new int[]{-5,-4,-3});
        printResults(null,null);
    }

    public static int[] arrays(int[] arrayA, int[] arrayB) {
//        if (arrayA.length != arrayB.length) {
//            throw new ArrayIndexOutOfBoundsException("Кількість елементів масива А не дорівнює кількості елементів масива В");
//        }
        int[] arrayC = new int[arrayA.length];
        for (int i = 0; i < arrayB.length; i++) {
            if (arrayA[i] > 0 && arrayB[i] > 0) {
                arrayC[i] = arrayA[i] + arrayB[i];
            } else if (arrayA[i] < 0 && arrayB[i] < 0) {
                arrayC[i] = arrayA[i] * arrayB[i];
            } else {
                arrayC[i] = 0;
            }
        }
        return arrayC;
    }

    static void printResults(int[] arrayA, int[] arrayB) {
        System.out.println("arrayA:" + Arrays.toString(arrayA) + "\narrayB:" + Arrays.toString(arrayB));
        try {
            System.out.println("arrayC: " + Arrays.toString(arrays(arrayA, arrayB)));
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}