public class task1 {
    public static void main(String[] args){
        printResults(13,4,1);
        printResults(15,3,7);
        printResults(16,8,1);
        printResults(3,2,1);
        printResults(9,13,10);
        printResults(11,12,13);
        printResults(14,3,13);
    }
    public static double function(int k, double z, double i){
        double result;
        result = (1/Math.sqrt(z*i) + Math.tan(k/i));
        return result;
    }

    public static double sum(int k, double z, double i){
        double current;
        int count = 1;
        double sum=0;
        sum += count;
        count++;


        if(k>15){
            throw new IllegalArgumentException("param k>15");
        }
        while(count<k){
            current = function(k,z,i);
            sum += current;
            count++;
        }
        return sum;
    }

    static void printResults(int k, double z, double i) {
        System.out.print("k:" + k + "z:" + z + " " + "i:" + i + "sum: ");
        try {
            System.out.println(sum(k,z,i));
        } catch (IllegalArgumentException e){
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}