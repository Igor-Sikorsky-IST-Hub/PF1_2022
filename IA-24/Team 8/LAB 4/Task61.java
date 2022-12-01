package lab4;

import java.util.Arrays;

public class Task61 {
    public static void main(String[] args) {
        int[] arrayA = {1, 2, 3, 4, 5};
        int[] arrayB = {4, 6, 1, 5, 9};
        int[] arrayA1 = {-1, -2, 3, 4, -5};
        int[] arrayB1 = {4, -6, -1, 5, 9};
        int[] arrayA2 = null;
        int[] arrayB2 = {4, -6, -1, 5, 9};
        int[] arrayA3 = {-1, -2, 3, 4, -5};
        int[] arrayB3 = {4, -6, -1, 5, 9, 8};
        printResult(arrayA, arrayB);
        printResult(arrayA1, arrayB1);
        printResult(arrayA2, arrayB2);
        printResult(arrayA3, arrayB3);
    }
    public static int[] calculation(int[] arrayA, int[] arrayB) {
        if (arrayA.length != arrayB.length) {
            throw new IllegalArgumentException("different arrays length");
        }
        int[] arrayC = new int[arrayA.length];
        for (int i = 0; i < arrayC.length; i++) {
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
    public static void printResult(int[] arrayA, int[] arrayB) {
        try {
            System.out.println(Arrays.toString(calculation(arrayA, arrayB)));
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: "+ e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Exception: array is null");
        }
    }
}