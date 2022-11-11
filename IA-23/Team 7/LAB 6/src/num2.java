public class num2 {
    public static void main(String[] args) {
        array(new short[] {1, 34, 56, 67, 78, 56, 12, -23, -98, 32766});
        array(new short[] {98, 87, 76, 65, 54, 43, 32, 21});
    }

    public static void array(short[] a){
        short num = 0;
        short min = 32767;
        int x = 0;
        for(int i = 0; i<a.length; ++i){
            min = 32767;
            for(int k = i; k< a.length; ++k){
                if(a[k]<min){
                    x = k;
                    min = a[k];
                }
            }
            num = a[x];
            a[x] = a[i];
            a[i] = num;
        }
        System.out.println("Матриця:");
        for(int i = 0; i<a.length; ++i){
            System.out.print(" " + a[i] + " ");
        }
        System.out.println();
    }
}
