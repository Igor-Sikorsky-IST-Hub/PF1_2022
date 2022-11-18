public class Task6 {
	public static void main(String[] args) {
	printResults(new int[][] {{0, 0}, 
							  {2, 0}});
	printResults(new int[][] {{1, 0}, 
		  					  {2, 0}});
	printResults(new int[][] {{0, 2}, 
		  					  {2, 0}});
	printResults(new int[][] {{0, 0, 2}, 
							  {2, 0, 0}, 
							  {0, 2, 0}});
	printResults(new int[][] {{1, 2, 3}, 
							  {4, 5, 6}});
	printResults(new int[][] {{0, 3, 6}, 
		  					  {1, 0, 0}, 
		                      {0, 1, 0}});
	printResults(new int[][] {{0, 2, 2, 1, 1}, 
		  					  {0, 0, 1, 0, 1}, 
                              {0, 1, 0, 0, 0},
                              {1, 2, 2, 0, 2}, 
			  				  {1, 1, 2, 0, 0}});
	}
	
    public static int getNumberOfWinners(int[][] matrix){
    	if (matrix.length!=matrix[0].length) {
    		throw new IllegalArgumentException("Матриця не квадратна");
    	}
    	int res = 0; 
    	for (int i = 0; i<matrix.length; i++) {
    		int counter = 0;
    		for (int j = 0; j<matrix.length; j++) {
    			if(i==j & matrix[i][j]!=0) {
    				throw new IllegalArgumentException("На головній діагоналі не 0");
    			}
    			if (i!=j) {
    				if (matrix[i][j]<0 | matrix[i][j]>2) {
    	    			throw new IllegalArgumentException("Матриця має недопустимі значення");
    	    		}
    				if (matrix[i][j]==1 ^ matrix[j][i]==1) {
    	    			throw new IllegalArgumentException("Значення нічиїх не збігається");
    	    		}
    				if ((matrix[i][j]==0 ^ matrix[j][i]==2) | (matrix[i][j]==2 ^ matrix[j][i]==0)) {
    	    			throw new IllegalArgumentException("Значення перемог на поразок не збігаються");
    	    		}
    				if (matrix[i][j]==2) {
    					counter+=1;
    				} else if (matrix[i][j]==0) {
    					counter-=1;
    				}
    			}
    		}
    		if (counter>0){
    			res+=1;
    		}
        }
        return res;
    }  
    static void printResults(int[][] matrix) {
    	System.out.println("Таблиця:");
    	for (int i[] : matrix) {
    		for(int j: i) {
    			System.out.print(j + " ");
    		}
    		System.out.println();
    	}
    	try {
            System.out.println("Кількість переможців: " + getNumberOfWinners(matrix));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}