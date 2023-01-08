public class SortBuble {
	public static void main(String[] args) {
		printResults(new byte[]{22, 1, 6, -3, 87, -77, 0, 0, -22, 1});
		printResults(new byte[] {5});
		printResults(new byte[] {-4, 8});
		printResults(new byte[] {1, 3, 5, 7});
		printResults(new byte[] {5, 4, 3, 0, -2, 7});
	}
	
    public static byte[] sortBuble(byte[] arr){
    	for (int i = arr.length; i>0; i--) {
    		for (int j = 0; j<i-1; j++) {
    			if (arr[j]<arr[j+1]) {
    				byte k = arr[j];
    				arr[j]=arr[j+1];
    				arr[j+1]= k;
    			}	
    		}
    	}
        return arr;
    }
    
    static void printResults(byte[] arr) {
    	System.out.println("Масив:");
    	for(byte i: arr) {
    		System.out.print(i + " ");
    	}
    	System.out.println();
    	System.out.println("Відсортований масив:");
    	for(byte i: sortBuble(arr)) {
    		System.out.print(i + " ");
    	}
    	System.out.println();
    }
}