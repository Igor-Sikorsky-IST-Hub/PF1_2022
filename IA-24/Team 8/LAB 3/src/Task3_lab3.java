public class Task3_lab3 {
    public static void main(String[] args) {

        System.out.println(function(9.19, 10));

    }
    static double function(double z, int k) {
        double res = 0;
        for (int i = 1; i <= k; i++) {
            res += (1 / Math.sqrt(z * i)) + Math.tan(k / i);
        }
        return res;
    }
}
