
import java.lang.Math;

public class Task7 {
    public static void main(String[] args) {
        printResults(1, 10);
        printResults(2, 5);
        printResults(3, 10);
        printResults(2, 0);
        printResults(6, -6);
        printResults(0, 10);
        printResults(0, 0);
        printResults(-5, -5);
        printResults(0, Double.MAX_VALUE);
        printResults(1, Double.MAX_VALUE);
        printResults(1, Double.NaN);
    }

    public static double axx(int i, double t) {
    	double res = 0;
    	if (t<=0 & i<1) {
    		throw new IllegalArgumentException("param t = " + t + ", param i = " + i);
    	} else if (t<=0) {
            throw new IllegalArgumentException("param t = " + t);
        } else if (i<1) {
        	throw new IllegalArgumentException("param i = " + i);
        }	
        if (i == 1 || i == 2) {
        	return Math.log(t);
        } else if (i>2) {
        	for (int k = 1; k <= i; k++) {
            	res +=  Math.sin(t)/k;
            }
        } 
        return res;
    }


    static void printResults(int i, double t) {
        System.out.print("i: " + i + " t: " + t + " result ");
        try {
            System.out.println(axx(i, t));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}