public class Task7 {
	public static void main(String[] args) {
	printResults(new int[][] {{1, 1}, 
							  {0, 0}});
	printResults(new int[][] {{1, 2, 3}, 
							  {4, 5, 6}, 
							  {7, 8, 9}});
	printResults(new int[][] {{1, 2, 3}, 
							  {4, 5, 6}});
	printResults(new int[][] {{1, 2}, 
							  {3, 4}, 
							  {5, 6}});
	}
	
    public static int[][] getTransposed(int[][] matrix){
    	
    	int[][] res = new int[matrix[0].length][matrix.length];
    	
    	for (int i = 0; i<matrix.length; i++) {
    		for (int j = 0; j<matrix[i].length; j++) {
    			res[j][i] = matrix[i][j];
    		}
        }

        return res;
    }
    
    static void printResults(int[][] matrix) {
    	System.out.println("Your matrix:");
    	for (int i[] : matrix) {
    		for(int j: i) {
    			System.out.print(j + " ");
    		}
    		System.out.println();
    	}
    	System.out.println("Result:");
    	for (int i[] : getTransposed(matrix)) {
    		for(int j: i) {
    			System.out.print(j + " ");
    		}
    		System.out.println();
    	}
    }
}