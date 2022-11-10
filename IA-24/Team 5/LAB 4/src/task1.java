package lab.four;

public class task1 {
    public static void main(String args[]) {
        double[] array1 = new double[]{-1, 2, 9, -6, 8, -4, 6};
        double[] array2 = new double[]{-5, -8, -9, -12};
        double[] array3 = new double[]{Double.MAX_VALUE,4,-9,8,3};
        double[] array4 = new double[]{2,7,8,3,1,0};
        double[] array5 = new double[]{5,-9,Double.NaN,3,156};
        printResults(array1);
        printResults(array2);
        printResults(array3);
        printResults(array4);
        printResults(array5);
    }

    public static int task5(double[] array) {
        int sum = 0;
        int a = array.length;
        for (double num: array) {
            if (num == Double.MAX_VALUE || Double.isNaN(num)) {
                throw new IllegalArgumentException();
            }
            if (num < 0) {
                sum += num;
            }
        }
        return sum;
    }

    public static void printResults(double[] array) {
            try{
            System.out.println("The sum of negative numbers of "  + "array  =   " + task5(array));
        }
            catch (IllegalArgumentException  e ){
                System.out.println("Exception!!!!   "+ e.getMessage()+ " Change the parametr");
            }
    }
}







