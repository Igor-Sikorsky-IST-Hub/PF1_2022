public class Task21 {
    public static void main(String[] args) {
        double a = -2.54;
        double b = 1.23;
        double c = -2.14;
        double d = -0.23;
        // a < 0 -> result is NaN
        double result = 3 * (Math.log(a / b) + Math.sqrt(Math.cos(c) + Math.pow(Math.E, d)));
        System.out.println(result);
    }
}

