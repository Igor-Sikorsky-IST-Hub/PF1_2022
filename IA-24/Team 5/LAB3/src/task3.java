package lab.three;

public class task3 {
        public static void main(String args[]) {
            printResults(0);
            printResults(0.00000000001);
            printResults(0.000002);
            printResults(0.0009);
            printResults(0.04);
            printResults(-0.10009);
            printResults(0.05);
            printResults(Double.MAX_VALUE);
            printResults(Double.NaN);
        }
        public static double sum(double e) {
            if (e <= 0 ) {
                throw new IllegalArgumentException("Change the 'e'!!!");
            }
            else if (Double.isNaN(e)){
                throw new IllegalArgumentException("Nan");
            }
            double i;
            double suma =0;
            for(i=1;;i++) {
                double a1 = Math.pow(-1,(i+1));
                double a2=i * (i+1)*(i+2);
                double a=a1/a2;
                suma+=a;
                if (Math.abs(a) <=e){
                    break;
                }
            }
            if (Double.isNaN(suma)) System.out.println("Nan");
            return suma;
        }
        static void printResults(double e) {
            System.out.print("e= " + e + " result = ");
            try {
                System.out.println(sum(e));
            } catch (IllegalArgumentException b) {
                System.out.println("EXCEPTION! " + b.getMessage());


            }


        }
    }

