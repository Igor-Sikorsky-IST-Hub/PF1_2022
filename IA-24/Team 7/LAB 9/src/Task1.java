import static java.lang.Math.pow;

public class Task1 {
    public static void printResult(int a) {
        if (a >=0){
            System.out.println("Результат: " + calculation(a));
        }
    }

    public static String calculation(int a) {
        int k = 0;
        String x = "";
        if(a <=1){
            x += a;
            return x;
        }
        else {
            k = 0;
            for (int i = 1; a >= i; i *= 16) {
                k += 1;
            }
            int[] f= new int[k];
            boolean z = false;
            for (int i = 1; i < 7;  i++){
                if (pow(16,i) == a){
                    z = true;
                }
            }

            if (z){
                f[f.length-1] = 1;
            }
            else{
                for (int i = 0; i<k-1; i++){
                    boolean contin = true;
                    for (int j =0;contin; j++){
                        if ((a > 16 * j) && (a <= 16 * (j+1))){
                            if(i == f.length-2){
                                if (a == 16){
                                    f[i] = 0;
                                    f[i+1] = 1;
                                    contin = false;
                                }
                                else{
                                    f[i] = a%16;
                                    f[i+1] = j;
                                    contin = false;
                                }
                            }
                            else{
                                f[i] = a%16;
                                a = j;
                                contin = false;
                            }
                        }
                    }
                }
            }

            for (int i = f.length-1; i >=0;i--){
                if ((f[i] >= 0) && (f[i] <10)) {
                    x += f[i] ;
                } else if (f[i] == 10) {
                    x += "A" ;
                }else if (f[i] == 11) {
                    x += "B" ;
                }else if (f[i] == 12) {
                    x += "C" ;
                }else if (f[i] == 13) {
                    x += "D" ;
                }else if (f[i] == 14) {
                    x += "E" ;
                } else if (f[i] == 15) {
                    x += "F" ;
                }
            }

            return x;
        }
    }

    public static void main(String[] args) {
        printResult(321);
        printResult(-5);
        printResult(4096);
        printResult(0);
        printResult(1);
        printResult(56799);
        printResult(51966);
    }
}
