public class Task3 {
    public static void main(String[] args) {
        printResults(13, 4, 1);
        printResults(16, 1, 5);
        printResults(10, 3, 2);
        printResults(4, 1, 3);
        printResults(6, 1, 4);
        printResults(11, 2, 13);
        printResults(12, 3, 6);
    }

    public static double function(int k, double z, double i) {
        double result;
        result = (1 / Math.abs(z * i) + Math.tan((k / i)));
        return result;
    }

    public static double summery(int k, double z, double i) {

        double current;
        int counter = 1;
        double sum = 0;
        sum += counter;
        counter++;

        if (k > 15) {
            throw new IllegalArgumentException("param k > 15");
        }
        while (counter < k) {
            current = function(k, z, i);
            sum += current;
            counter++;
        }
        return sum;
    }

    static void printResults(int k, double z, double i) {
        System.out.print("k:" + k + " z:" + z + " " + "i:" + i + " Sum: ");
        try {
            System.out.println(summery(k, z, i));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}