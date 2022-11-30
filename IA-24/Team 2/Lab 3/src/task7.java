public class task7 {
    public static void main(String[] args) {
        printResults(0,  1);
        printResults(1,  10);
        printResults(1,  1);
        printResults(2,  0);
        printResults(1,  2);
        printResults(2,  -10);
        printResults(20,  20);
        printResults(21,  21);
        printResults(1,  10);
        printResults(-1,  10);
        printResults(0, Double.MAX_VALUE);
        printResults(1, Double.MAX_VALUE);
        printResults(1, Double.NaN);

    }
    public static double axx( int i, double t) {
        double res=0;
        if (t<=0 & i<1) {
            throw new IllegalArgumentException("param t = " + t + ", param i  =" + i);
        }else if (t<=0) {
            throw new IllegalArgumentException("param t = " + t);
        }else if(i<0) {
            throw new IllegalArgumentException("param i = " + i);
        }
        if ( i==1 || i==2) {
            return Math.log(t);
        } else if (i>2) {
            for (int k = 1; k <=1; k++){
                res += Math.sin(t)/k;
            }
        }
        return res;
    }
    static void printResults(int i, double t) {
        System.out.print("i: " + i + "t: " + t + "result");
        try {
            System.out.println(axx(i, t));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION: " + e.getMessage());

        }
    }
}
