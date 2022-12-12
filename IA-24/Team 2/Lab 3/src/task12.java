public class Task12 {
    public static void main(String[] args) {
        printResults(0);
        printResults(0.0000003);
        printResults(0.4);
        printResults(0.0009343);
        printResults(0.04);
        printResults(-0.1003);
        printResults(0.07);
        printResults(Double.MAX_VALUE);
        printResults(Double.NaN);
    }
    public static double sum(double e) {
        if (e <= 0 ) {
            throw new IllegalArgumentException("Change the value of e");
        }
        else if (Double.isNaN(e)){
            throw new IllegalArgumentException("Nan");
        }
        double sum = 0;
        for(double i = 1;; i ++) {
            double a = 1 / (i * (i + 1));
            sum += a;
            if (Math.abs(a) <= e){
                break;
            }
        }
        if (Double.isNaN(sum)) System.out.println("Nan");
        return sum;
    }
    static void printResults(double e) {
        System.out.print("e = " + e + " result = ");
        try {
            System.out.println(sum(e));
        } catch (IllegalArgumentException b) {
            System.out.println("EXCEPTION! " + b.getMessage());


        }


    }
}