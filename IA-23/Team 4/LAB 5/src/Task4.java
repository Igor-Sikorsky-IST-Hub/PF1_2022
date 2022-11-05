public class Task4 {
    public static void main(String[] args) {
        printResults(new int[][]{{1, 2}, {3, 4}});
        printResults(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        printResults(new int[][]{});
        printResults(new int[][] {{ 1 }, { 3, 4 }});
    }

    public static int[][] getTransposed(int[][] matrix) {
        if (matrix.length == 0) {
            throw new IllegalArgumentException("Matrix contain no values");
        }
        if (matrix.length != matrix[0].length){
            throw new IllegalArgumentException("Matrix is not square");
        }

        int[][] transposedMatrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        return transposedMatrix;
    }

    static void printMatrix(String s, int[][] matrix) {
        System.out.println(s);
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    static void printResults(int[][] matrix) {
        try {
            printMatrix("Print input matrix", matrix);
            printMatrix("Print output matrix", getTransposed(matrix));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}

