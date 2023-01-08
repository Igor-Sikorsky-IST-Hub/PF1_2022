public class task1 {
    public static void main(String[] args){
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9,18,22,24,27};
        int[] b = null;
        printResults(a);
        printResults(b);
    }
    public static int sum(int[] a) {
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
            System.out.println("Сума чисел, кратних 3: " + sum(resArray));
        } catch(NullPointerException e) {
            System.out.println("Exception: array is null");
        }
    }
}