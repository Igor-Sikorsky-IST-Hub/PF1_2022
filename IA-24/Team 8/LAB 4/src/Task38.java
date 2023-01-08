package lab4;

import java.util.Arrays;

public class Task38 {
    private static double task38(int[] userArray){
        int sum = 0;
        sum += userArray[2];
        Arrays.sort(userArray);
        sum += userArray[userArray.length-1];
        return sum;
    }
    public static void main(String[] args){
        int[] aArray = new int[] {-1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] bArray = new int[] {-3, 1, 6, -10, 7, 0, -2, 8, -2};
        int[] cArray = new int[0];
        printResults(aArray);
        printResults(bArray);
        printResults(cArray);
    }
    static void printResults(int[] resArray){
        try {
            System.out.println("Сума 3 і найбільшого значень: " +task38(resArray));
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: index is out of bounds");
        }
    }
}
