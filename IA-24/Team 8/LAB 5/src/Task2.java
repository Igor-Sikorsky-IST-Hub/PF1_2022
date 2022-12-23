package lab5;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[][] matrixExample = new int[][] {{5, 7, 0, 17}, {7, 0, 1, 12}, {8, 1, 0, 3}};
        int[][] matrixExample2 = new int[][] {{2, 3, 5}, {4, 0, 1}};
        int[][] matrixExample3 = new int[][] {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        int[][] matrixExample4 = new int[][] {{1, 2}, {3, 4}, {5, 6}};
        int[][] matrixExample5 = {};
        int[][] matrixExample6 = null;

        printResults(matrixExample);
        printResults(matrixExample2);
        printResults(matrixExample3);
        printResults(matrixExample4);
        printResults(matrixExample5);
        printResults(matrixExample6);
    }

    static void lolSwap(int[][] matrix) {
        int count = matrix.length;

        int[] tmp = matrix[0];
        matrix[0] = matrix[count - 1];
        matrix[count - 1] = tmp;

        System.out.println(Arrays.deepToString(matrix));
    }

    static void printResults(int[][] matrix) {
        try {
            System.out.println("Матриця: " +Arrays.deepToString(matrix));
            lolSwap(matrix);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: array is empty");
        } catch (NullPointerException e) {
            System.out.println("Exception: array is null");
        }

    }
}
