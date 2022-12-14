import java.util.Arrays;

public class func1 {
    public static void main(String[] args) {
        printResults(new int[][] {{}});
        printResults(new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } });
        printResults(new int[][] { { 6, 8, 9, 3 }, { 5, 6, 7, 10 }, { 9, 10, 11, 12 }, { 12, 18, 9, 12 } });
        printResults(new int[][] {{1, 2}, {3, 4}});

    }

    public static int [][] lolSwap(int [][] matrix) {
        if (matrix.length == 0) {
            throw new IllegalArgumentException("Type some values into matrix");
        }
        int[] buff = Arrays.copyOf(matrix[0], matrix[0].length);
        matrix[0] = Arrays.copyOf(matrix[matrix.length - 1], matrix[0].length);
        matrix[matrix.length - 1] = Arrays.copyOf(buff, buff.length);
        return matrix;
    }

    static void printResults(int[][] matrix) {
        int[][] arr = lolSwap(matrix);
        try {
            System.out.print("result: ");
            for(int i = 0; i < matrix.length; i++) {
                for(int j = 0; j < matrix[0].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println("");
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}



