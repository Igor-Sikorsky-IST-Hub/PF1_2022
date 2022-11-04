

import java.lang.Math;

public class Task36 {
	public static void main(String[] args) {
    	printResults(new int[] {1, 2, 3 , 4});
    	printResults(new int[] {0, 0, 0, 10 ,2, 100, -5});
    	printResults(new int[] {-5, -10, -15});
    	printResults(new int[] {0 , 6, 12, 4});
    }

    public static int findMin(int[] arr) {
    	int min = 0;
        for (int i=0; i<arr.length; i++) {
        	if(arr[i]<arr[min]) {
        		min = i;
        	}
        }
        return min + 1;     
    }
    public static int findMax(int[] arr) {
    	int max = 0;
        for (int i=0; i<arr.length; i++) {
        	if(arr[i]>arr[max]) {
        		max = i;
        	}
        }
        return max + 1;     
    }
    public static double findResult(int min, int max) {
    	double res = Math.sqrt(min * max);
        return res;     
    }
    static void printResults(int[] arr) {
    	for (int i : arr) {
    		System.out.print(i + " ");	
    	}
    	System.out.println();
    	System.out.println("Cереднє геометричне номерів максимального та мінімального елементів масиву — "
    			+ findResult(findMin(arr), findMax(arr)));
    }
}