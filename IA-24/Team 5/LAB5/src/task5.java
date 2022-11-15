package lab.five;
public class task5 {
}
    class matrix {
        public static void main(String args[]) {
            double[][] matrix1 = {
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 1, 2, 3},
                    {7, 3, 2, 1}
            };
            double[][] matrix2 = {
                    {1, 2, 3, 4, 8, 9},
                    {5, 6, 7, 8, 9, 1},
                    {9, 1, 2, 3, 6, 2},
                    {7, 3, 2, 1, 3, 1},
                    {2, 1, 6, 5, 3, 4},
                    {6, 3, 2, 1, 5, 4},
            };
            double[][] matrix3 = {
                    {1, 2, Double.MAX_VALUE, 4},
                    {5, 6, 7, 8},
                    {9, 1, 2, 3},
                    {7, 3, 2, 1}
            };
            double[][] matrix4 = {
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, Double.NaN, 2, 3},
                    {7, 3, 2, 1}
            };
            printResults(matrix1);
            printResults(matrix2);
            printResults(matrix3);
            printResults(matrix4);
        }

        static String  clearNE(double[][] matrix) {
            int len = matrix.length;
            for (int i = 0; i < len; i++) {
                for (int j = 0; j < len; j++) {
                    if (matrix[i][j] == Double.MAX_VALUE || Double.isNaN(matrix[i][j])) {
                        throw new IllegalArgumentException();
                    }
                    if (i > j) matrix[i][j] = (int) matrix[i][j];
                    else {
                        matrix[i][j] = (int) 0;
                    }

                }
            }
            return ("");
        }

        public static void printResults(double[][] matrix) {
            try {
                System.out.println("New matrix=");
                System.out.println(clearNE(matrix));
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix.length; j++) {
                        System.out.print(matrix[i][j]+ "  ");
                    }
                    System.out.println();
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Exception!!! Change the element of matrix");
            }
        }
    }




