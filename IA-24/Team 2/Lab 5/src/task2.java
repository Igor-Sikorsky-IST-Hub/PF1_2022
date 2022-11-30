public class task2 {

    public static void main(String[] args) {

        printResults(new int[][]{{1, 4, 5}, {1, 2, 3}, {12, 32, 22}});
        printResults(new int[][]{{1, 1, 1}, {0, 0, 0}, {0, 23, 44}});
        printResults(new int[][]{{7, 2, 9}, {1, 3, 6}, {1, 2, 3}});
        printResults(new int[][]{{0, 0, 0}, {11, 3, 7}, {2, 6, 56}});
        printResults(new int[][]{{10, 74, 12}, {33, 1, 3}, {1, 3, 1, 2}});
    }

    public static int[][] lolSwap(int[][] matrix) {
        if (matrix[0].length != matrix[2].length ){
            throw new IllegalArgumentException("Матрицю не можна змінити");
        }
        int[] temp = matrix[0];
        matrix[0] = matrix[2];
        matrix[2] = temp;


        return matrix;
    }

    static void printResults(int[][] matrix) {
        System.out.println("Нова матриця: ");
        try {
            int[][] changedMatrix = lolSwap(matrix);
            for (int[] ints : changedMatrix) {
                for (int anInt : ints) {
                    System.out.print(anInt + " ");
                }
                System.out.println();
            }

        }   catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}