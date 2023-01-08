public class task_8 {
    public static void main(String[] args) {
        double res = function(10, 0.25);
        System.out.println(res);
    }

    static double function(int n, double t) {
        double firstBrack = 0;
        double secondBrack = 0;
        double res = 0;
        int[] l1 = {1, 3, 5};
        int[] l2 = {2, 4, 6};
        for (int j = 0; j < l1.length; j++) {
            for (int i = 1; i <= n; i++) {
                firstBrack = 1 / t * l1[j];
                secondBrack = (1 / Math.sqrt(t)) * l2[j];
                if (firstBrack == secondBrack) {
                    res += firstBrack;
                }
            }

        }


        return res;
    }

}