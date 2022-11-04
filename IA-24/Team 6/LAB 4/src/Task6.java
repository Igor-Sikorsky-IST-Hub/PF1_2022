

public class Task6 {
    public static void main(String[] args) {
    	printResults(new int[] {50, 10, 15, 0, 6});
    	printResults(new int[] {0, 0, 2,  0, 10 ,2, 100, -5});
    	printResults(new int[] {-5, -10, -15});
    	printResults(new int[] {0 , 6, 12, 4});
    }

    public static int findMin(int[] arr) {
    	int min = arr[0];
    	
        for (int i : arr) {
        	if(i%5==0 & i>0) {
        		if((min%5!=0 | min<=0)  | (i<min)) {
        			min = i;
        		}
        	}
        }
        if(min%5!=0 | min<=0) {
        	throw new IllegalArgumentException("Жодне число не кратне 5");
    	}
        return min;
    }
    static void printResults(int[] arr) {
    	for (int i : arr) {
    		System.out.print(i + " ");	
    	}
    	System.out.println();
        try {
            System.out.println("Найменше число, що кратне 5: " + findMin(arr));
        } catch (IllegalArgumentException er) {
        	System.out.println("EXCEPTION! " + er.getMessage());
        }
    }
}

