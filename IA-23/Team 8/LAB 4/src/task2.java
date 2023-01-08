import java.util.Arrays;
public class task2 {
    private static double task2(int[] userArray){
        int sum = 0;
        sum += userArray[2];
        Arrays.sort(userArray);
        sum += userArray[userArray.length-1];
        return sum;
    }
    public static void main(String[] args){
        int[] a = new int[] {-1, 2, 3, 4, 6, 9, 10};
        int[] b = new int[] {-2, 1, 6, -10, 7, 4, -5};
        int[] c = new int[0];
        printResults(a);
        printResults(b);
        printResults(c);
    }
    static void printResults(int[] resArray){
        try {
            System.out.println("Сума третього та найбільшого додатного елементів: " +task2(resArray));
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: index is out of bounds");
        }
    }
}
