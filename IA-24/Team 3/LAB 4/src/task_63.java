public class task_63 {
    public static void main(String[] args) {
        int[] numbers = {5, -4, 10, 0, 2, -8, 1, 0, -3, -5, 0, 2, 1, 9};
        int[] newMassive = findNew(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(newMassive[i] + ";");

        }
    }
    static int[] findNew (int[] n ) {

        int[] newNumbers = new int[n.length] ;
        for (int i=0; i<n.length;i++) {
            if (n[i]<0) {
                newNumbers[i] = n[i] + findMax(n) ;

            }
            else if (n[i]==0) {
                newNumbers[i]=1;

            }
            else if (n[i]>0) {
                newNumbers[i]= n[i] *2 ;
            }
        }
        return newNumbers;

    }
    static int findMax (int[] n ){
        int max = 0;
        for (int i = 0;i<n.length;i++ ){
            if (n[i]>max) {
                max = n[i] ;
            }
        }
        return max;
    }
}
