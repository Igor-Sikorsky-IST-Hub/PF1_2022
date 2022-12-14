import java.lang.Math;

public class Task1 {
    public static void main(String[] args) {
        int[][] original = { { 1, 6, 4 }, { 2, 4, 3 }, { 3, 4, 2 } };

        System.out.println("Матриця без транспортування:");
        printResult(original);

        System.out.println("Транспортована матриця:");
        printResult(Transpose(original));
    }

    public static int[][] Transpose(int[][] original) {
        int[][] transposed = new int[original[1].length][original[0].length];

        for (int i = 0; i < original[0].length; i++) {
            for (int j = 0; j < original[1].length; j++) {
                transposed[i][j] = original[j][i];
            }
        }
        return transposed;
    }

    public static void printResult(int[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}