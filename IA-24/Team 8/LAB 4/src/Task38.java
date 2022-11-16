import java.util.Arrays;

public class Task38 {
    private static double task38(int[] userArray){
        int sum = 0;
        sum += userArray[2];
        Arrays.sort(userArray);
        sum += userArray[userArray.length-1];
        System.out.println("Сума 3 і найбільшого значень: " + sum);
        return 0;
    }
    public static void main(String[] args){
        int[] aArray = new int[] {-1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] bArray = new int[] {-3, 1, 6, -10, 7, 0, -2, 8, -2};
        task38(aArray);
        task38(bArray);
    }
}
