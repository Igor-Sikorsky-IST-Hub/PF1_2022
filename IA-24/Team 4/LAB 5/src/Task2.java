public class Task2 {
    public static void main(String[] args) {
        int[][] results = new int[4][];
        results[0] = new int[] {0, 2, 1, 0};
        results[1] = new int[] {0, 0, 1, 1, 2};
        results[2] = new int[] {1, 1, 0, 1};
        results[3] = new int[] {2, 1, 1, 0};
               
        printResults(results);

        results = null;
        
        printResults(results);
        
        results = new int[][] {};

        printResults(results);

        results = new int[][] { {1, 1, 2},
                                {1, 0, 2},
                                {0, 0, 0} };

        printResults(results);

        results = new int[][] { {0, 2, 1, 0, 0},
                                {0, 0, 2, 1, 2},
                                {1, 0, 0, 1, 0},
                                {2, 1, 1, 0, 2},
                                {2, 0, 2, 0, 0} };
        
        printResults(results);
        
        results = new int[][] { {0, 2, 2},
                                {0, 0, 2},
                                {0, 0, 0} };

        printResults(results);
    }       
    
    public static boolean isUnbalanced(int[][] results) {
        if (results == null) {
            throw new NullPointerException("Matrix shouldn't be null!");
        }
        if (results.length == 0) {
            throw new IndexOutOfBoundsException("Matrix shouldn't be empty!");
        }
        for (int i = 0; i < results.length; i++) {
            int count = 0;
            if (results[i].length != results.length) {
                throw new IndexOutOfBoundsException("Matrix should be square!");
            }
            for (int j = 0; j < results.length; j++) {
                if (i != j) {
                    count += results[i][j] == 2 ? 1 : 0;                    
                } else if (results[i][j] != 0){
                    throw new IllegalArgumentException("Main diagonal should consist of zeros only!");
                }
            }
            if (count > (results.length - 1) / 2) {
                return true;
            }
        }
        return false;
    } 

    public static void printResults(int[][] results) {
        if (results == null){
            System.out.print("matrix: " + results + " result: ");
        } else {
            System.out.println("matrix: ");
            for (int i = 0; i < results.length; i++) {
                for (int j = 0; j < results[i].length; j++) {
                    System.out.print(results[i][j] + " ");
                }
                System.out.println();
            }
            System.out.print("result: ");
        }
        try {
            System.out.println(isUnbalanced(results)); 
        } catch (IllegalArgumentException | IndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Error! " + e.getMessage());
        }
        System.out.println("===============================================");
    }
}