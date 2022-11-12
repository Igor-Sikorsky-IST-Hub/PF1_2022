public class task9 {
    public static void main(String[] args) {

        printArray(newMatrix(3, 3, 10));
        printArray(newMatrix(1, 1, 2));
        printArray(newMatrix(4, 2, 15));
        printArray(newMatrix(-1, -3, 10));
        printArray(newMatrix(-1, 3, 10));
        printArray(newMatrix(0, 0, 1));
        printArray(newMatrix(3, 3, 0));
        printArray(newMatrix(3, 3, Integer.MAX_VALUE));
        printArray(newMatrix(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE));
    }

    public static int[][] toArray(int[][] matrix) {
        if (matrix == null) {
            throw new NullPointerException("Matrix doesn't exist or can't be created");
        }
        int arrayLength = numberOfNonZeroCells(matrix);
        int[][] array = new int[arrayLength][3];
        int lastNonOccupiedCell = 0;
        for (int height = 0; height < matrix.length; height++) {
            for (int length = 0; length < matrix[height].length; length++) {
                if (matrix[height][length] != 0) {
                    array[lastNonOccupiedCell][0] = height;
                    array[lastNonOccupiedCell][1] = length;
                    array[lastNonOccupiedCell][2] = matrix[height][length];
                    lastNonOccupiedCell++;
                }
            }
        }
        return array;
    }

    public static int[][] newMatrix(int length, int height, int maxValuePlusOne) {
        if (length <= 0 | height <= 0 | maxValuePlusOne <= 1) {
            return null;
        }
        try {
            int[][] matrix = new int[height][length];
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < length; j++) {
                    int randomInt = (int) (Math.random() * maxValuePlusOne);
                    matrix[i][j] = randomInt;
                }
            }
            return matrix;
        } catch (OutOfMemoryError e) {
            return null;
        }
    }

    public static void printArray(int[][] matrix) {
        try {
            int[][] array = toArray(matrix);
            if (array.length != 0) {
                System.out.print(Colors.ANSI_GREEN + "Array: " + Colors.ANSI_RESET);
                for (int i = 0; i < array.length; i++) {
                    System.out.print("[");
                    for (int j = 0; j < array[i].length; j++) {
                        // check if it's not the last element in a nested array
                        if (j != array[i].length - 1) {
                            System.out.print(array[i][j] + ", ");
                        } else {
                            System.out.print(array[i][j]);
                        }
                    }
                    // check if it's not the last element in an array
                    if (i != array.length - 1) {
                        System.out.print("], ");
                    } else {
                        System.out.println("]");
                    }
                }
            } else {
                System.out.println(Colors.ANSI_GREEN + "Array: " + Colors.ANSI_RESET + "[]");
            }
        } catch (NullPointerException e) {
            System.out.println(Colors.ANSI_RED + "EXCEPTION! " + Colors.ANSI_RESET + e.getMessage());
        }

    }

    public static int numberOfNonZeroCells(int[][] matrix) {
        int nonZeroCounter = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != 0) {
                    nonZeroCounter++;
                }
            }
        }
        return nonZeroCounter;
    }
}