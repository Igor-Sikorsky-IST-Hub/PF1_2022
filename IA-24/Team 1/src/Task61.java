import java.util.Arrays;

public class Task61 {
    public static void main(String[] args) {
        int [] A = {1,3,-5,-7,8};
        int [] B = {-2,-4,-7,10};
        printResult(A, B);

    }
    public static int[] axx(int[] A, int[] B) {
        int [] C = {};
        for(int i : A) {
            if (i > B.length){
                throw new IndexOutOfBoundsException("EXCEPTION!");
            }
            if (A[i] > 0 & B[i] > 0) {
                C[i] = A[i] + B[i];
            } if(A[i] < 0 & B[i] < 0) {
                C[i] = A[i] * B[i];
            }
            else{
                C[i]=0;
            }
        }
        return C;
    }
    static void printResult(int[] A, int[] B) {

        System.out.print("A: " + Arrays.toString(A) + " B: "+ Arrays.toString(B));
        try {
            System.out.println(Arrays.toString(axx(A,B)));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }

}
