public class func2 {

    public static void main(String args[]) {
        int a[][] = {{2, 6, 7}, {1, 2, 3}, {4, 5, 6}};
        int b[][] = {{1, 0, 1}, {2, 2, 2}, {3, 0, 3}};
        printResults(a, b);
    }
    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        if(matrix1.length == 0) {
            throw new IllegalArgumentException("Type some values into matrix");
        }
        int matrix3[][] = new int[matrix1[0].length][matrix2.length];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix3[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    matrix3[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return matrix3;
    }
    static void printResults(int[][] matrix1, int[][] matrix2) {
        int[][] matrix3 = multiply(matrix1, matrix2);
        try {
            System.out.println("result: ");
            for(int i = 0; i < matrix3.length; i++) {
                for(int j = 0; j < matrix3[0].length; j++) {
                    System.out.print(matrix3[i][j] + " ");
                }
                System.out.println("");
            }
            System.out.println("");
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}

