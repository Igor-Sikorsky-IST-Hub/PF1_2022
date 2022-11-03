
import java.lang.Math;

public class Task13 {
    public static void main(String[] args) {
        printResults(0);
        printResults(0.0005);
        printResults(-3);
        printResults(0.2);
        printResults(0.0004);
        printResults(Double.MAX_VALUE);
        printResults(Double.MIN_VALUE);
        printResults(Double.NaN);
    }
    static double countDodanok(int i) {
    	double fac = 0;
    	for (int k = 1; k <= i; k++) {
    		fac+=k;
    	}
    	return (Math.pow(-1, i)/fac);
    }
    
    public static double axx(double e) {
    	double res = 0;
    	if (e<=0) {
    		throw new IllegalArgumentException("param ε = " + e);
    	}
    	int i = 1;
        while (Math.abs(countDodanok(i))>e) {
        	res += countDodanok(i);
        	i++;
        }
        return res;
    }


    static void printResults(double e) {
        System.out.print("ε: " + e + " result ");
        try {
            System.out.println(axx(e));
        } catch (IllegalArgumentException er) {
            System.out.println("EXCEPTION! " + er.getMessage());
        }
    }
}