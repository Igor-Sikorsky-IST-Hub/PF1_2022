public class Task7 {

    public static void main(String[] args) {
        int[][] m1 = {{1, 2}, {3, 4}, {5, 6}};
        printResults(m1);
        int[][] m2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        printResults(m2);

    }

    public static int[][] getTransposed(int[][] matrix) {
        int[][] res = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                res[j][i] = matrix[i][j];
            }
        }
        return res;
    }

    static void printMatrix(String s, int[][] m) {
        System.out.println(s);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + " ");
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