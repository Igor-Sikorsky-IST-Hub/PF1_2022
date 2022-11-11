public class Main {

    public static void main(String[] args) {
        array(new short[] {1, 34, 67, 23, 2, 78, 70});
        array(new short[] {-1, -45, 12, -34, -67, -89, -67});
        array(new short[] {98, 76, 65, 54, 43, 32, 21});
    }

    public static void array(short[] a){
        short num = 0;
        for(int i = 0; i< a.length;++i){
            for(int k = 0; k<a.length - 1 - i; ++k){
                if(a[k]>a[k + 1]){
                    num = a[k];
                    a[k] = a[k + 1];
                    a[k + 1] = num;
                }
            }
        }
        System.out.println("Матриця:");
        for(int i = 0; i<a.length; ++i){
            System.out.print(" " + a[i] + " ");
        }
        System.out.println();
    }
}