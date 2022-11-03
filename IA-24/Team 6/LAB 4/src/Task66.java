package lab4;

public class Task66 {
	public static void main(String[] args) {
    	printResults(new int[] {1, 2 ,3}, new int[] {3, 2 ,1});
    	printResults(new int[] {0, 0, 10 ,2, 100, -5}, new int[] {22, -22 , 0});
    }

    public static int[] newArr(int[] arr1, int[] arr2) {
    	int[] res = new int[arr1.length+arr2.length];
    	for (int i = 0; i<res.length; i++) {
    		if(i<arr1.length) {
    			res[i]=arr1[i];
    		}
    		else {
    			res[i]=arr2[i-arr1.length];
    		}
    	}
    	return res;
    }

    static void printResults(int[] arr1, int[] arr2){
    	for (int i : arr1) {
    		System.out.print(i + " ");	
    	}
    	System.out.println();
    	for (int i : arr2) {
    		System.out.print(i + " ");	
    	}
    	System.out.println();
    	System.out.println("Result");
    	for (int i : newArr(arr1, arr2)) {
    		System.out.print(i + " ");	
    	}
    	System.out.println("\n");
    }
}