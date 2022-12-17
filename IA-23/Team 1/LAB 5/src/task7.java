public class task7 {
    public static void main(String[] args) {
        printResults(new int[][] {{1,2,3, 4}, {5,6, 7, 8}, {9, 10, 11, 12}}, new int[4][3]);
        printResults(new int[][] {}, new int[4][3]);
    }

    public static int[][] transposedMatrix(int[][] sourceMatrix, int[][] transposedMatrix) {

        if (sourceMatrix.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        for (int i = 0; i < sourceMatrix.length; i++) {
            for (int j = 0; j < sourceMatrix[i].length; j++) {
                transposedMatrix[j][i] = sourceMatrix[i][j];
            }
        }

        for (int i = 0; i < transposedMatrix.length; i++) {
            for (int j = 0; j < transposedMatrix[i].length; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
        return transposedMatrix;
    }

    static void printResults(int[][] array, int[][] transposedMatrix){
        try {
            transposedMatrix(array, transposedMatrix);
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION " + e.getMessage());
        }
    }
}