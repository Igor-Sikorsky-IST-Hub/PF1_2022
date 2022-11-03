
import java.lang.Math;

public class Task1 {
    public static void main(String[] args) {
        printResults(10, 10);
        printResults(1, 1);
        printResults(1, 0);
        printResults(5, 0);
        printResults(50, 1);
        printResults(-6, 4);
        printResults(100, -10);
        printResults(1, -10);
        printResults(30, -10);
        printResults(0, Double.MAX_VALUE);
        printResults(1, Double.MAX_VALUE);
        printResults(1, Double.NaN);
    }

    public static double axx(int k, double m) {
    	double res = 0;
    	if ((k>30 || k<1) & m<0) {
    		throw new IllegalArgumentException("param k = " + k + ", param m = " + m);
    	}
        if (k>30 || k<1) {
            throw new IllegalArgumentException("param k = " + k);
        } else if (m<0) {
        	throw new IllegalArgumentException("param m = " + m);
        }
       
        for (int i = 1; i <= k; i++) {
        	res +=  Math.sqrt(m/i) * Math.sin(m*i);
        }
        return res;
    }


    static void printResults(int k, double m) {
        System.out.print("k: " + k + " m: " + m + " result ");
        try {
            System.out.println(axx(k, m));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}

