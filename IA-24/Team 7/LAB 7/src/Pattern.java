import java.util.Arrays;
import java.util.Scanner;

public class Pattern {
    private static Strategy strategy;
    public static void main(String[] args) {
        printResults(new byte[]{1, 25, -3, 4, 5});
    }
    public static void printResults(byte[] arr){
        Scanner sc = new Scanner(System.in);
        if(arr == null){throw new NullPointerException("Can't handle null arrays");}
        if(arr.length == 0){throw new IllegalArgumentException("Can't handle zero-length arrays.");}
        else{
            System.out.println("Choose method of sorting:");
            System.out.println("1 - method is Bubble sort method");
            System.out.println("2 - method is Selection sort method");
            System.out.println("3 - method is Insertion sort method");
                int i = sc.nextInt();
                switch (i) {
                    case 1:
                        strategy = new Bubblesort();
                    case 2:
                        strategy = new Selectionsort();
                    case 3:
                        strategy = new Insertionsort();
                }
                System.out.println(Arrays.toString(strategy.sort(arr)));
        }
    }
}
