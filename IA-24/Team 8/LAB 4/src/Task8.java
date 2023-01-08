package lab4;

public class Task8 {
    public static void main(String[] args){
        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] x1 = null;
        printResults(x);
        printResults(x1);
    }
    public static int calculation(int[] a) {
        int sum = 0;
        for ( int i:a){
            if (i % 3 == 0){
                sum +=i;
            }
        }
        return sum;
    }
    static void printResults(int[] resArray){
        try {
            System.out.println("Сума чисел, кратних 3: " + calculation(resArray));
        } catch(NullPointerException e) {
            System.out.println("Exception: array is null");
        }
    }
}
