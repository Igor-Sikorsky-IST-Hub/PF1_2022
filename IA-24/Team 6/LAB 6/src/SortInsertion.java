public class SortInsertion{
	public static void main(String[] args) {
		printResults(new byte[]{22, 1, 6, -3, 87, -77, 0, 0, -22, 1});
		printResults(new byte[] {5});
		printResults(new byte[] {-4, 8});
		printResults(new byte[] {1, 3, 5, 7});
		printResults(new byte[] {5, 4, 3, 0, -2, 7});
	}
	
    public static byte[] sortInsertion(byte[] arr){
    	for (int i = 1; i<arr.length; i++) {
    		byte main = arr[i];
    		int index = i-1;	
    		while((index>=0) && (main>arr[index])) {
    			arr[index+1] = arr[index];
    			index=index-1;
    		}
    		arr[index+1]=main;
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
    	for(byte i: sortInsertion(arr)) {
    		System.out.print(i + " ");
    	}
    	System.out.println();
    }
}