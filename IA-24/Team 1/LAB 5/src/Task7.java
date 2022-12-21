import java.util.Arrays;
public class task7 {
    public static void main(String[] args) {
        printResults(new int[][] {{1, 2, 3},
                                  {3, 4, 5}});

        printResults(new int[][] {{1, 2, 2},
                                  {8, 10, 3},
                                  {5, 4, 3}});

        printResults(new int[][] {{2, 3, 5, 6},
                                  {3, 2, 9, 8}});

        printResults(new int[][] {{1, 3},
                                  {3, 4},
                                  {6, 7},
                                  {7, 7}});

        printResults(new int[][] {{2, 1},
                                 {3, 2}});

        printResults(new int[][] {{}, {}});
    }
    public static int[][] getTransposed(int[][] matrix) {
        int i, j;
        int[][] matrixNew = new int[matrix[0].length][matrix.length];
        if (matrix[0].length == 0) {
            throw new IllegalArgumentException("Матриця не має елементів");
        } else {
            for (i = 0; i < matrix.length; i++) {
                for (j = 0; j < matrix[i].length; j++) {
                    matrixNew[j][i] = matrix[i][j];
                }
            }
        }
        return matrixNew;
    }
    static void printResults(int[][] matrix) {
        System.out.println("Матриця:");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println("Транспонована матриця:");
        try {
            for (int i = 0; i < getTransposed(matrix).length; i++) {
                System.out.println(Arrays.toString(getTransposed(matrix)[i]));
            }
            System.out.println("---------------");
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}
