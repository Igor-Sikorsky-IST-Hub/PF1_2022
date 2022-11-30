public class task8 {

    public static void main(String[] args) {
        int[][] a = {{1, 3, 1}, {2, 2, 6}, {0, 3, 0}};
        int[][] b = {{1, 0, 1}, {2, 10, 6}, {0, 3, 0}};
        int[][] c = {{0, 0, 0}, {1, 0, 7}, {0, 0, 0}};
        int[][] d = {{0, 0, 0}, {1, 0, 7}, {0, 0, 0}};
        int[][] e = {{0, 7, 11}, {3, 2, 6}};
        printResults(a, b);
        printResults(c, d);
        printResults(c, b);
        printResults(a, d);
        printResults(d, b);
        printResults(a, e);
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        if(matrix1.length != matrix2.length){
            throw new IllegalArgumentException("Матриці не можна перемножити");
        }

        int[][] matrix3 = new int[matrix1[0].length][matrix2.length];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    matrix3[k][j] = (matrix1[k][i] * matrix2[i][j] + matrix1[k][i+1] * matrix2[i+1][j] + matrix1[k][i+2] * matrix2[i+2][j]);
                }
            }
            i=3;
        }

        return matrix3;
    }
    static void printResults(int[][] matrix1, int[][] matrix2) {
        int[][] matrix3 = multiply(matrix1, matrix2);
        try {
            System.out.println("Result: ");
            for (int[] ints : matrix3) {
                for (int j = 0; j < matrix3[0].length; j++) {
                    System.out.print(ints[j] + " ");
                }
                System.out.println(" ");
            }
            System.out.println(" ");
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}