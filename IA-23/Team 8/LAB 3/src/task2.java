import static java.lang.Math.*;
public class task2 {
    public static void main(String[] args){
        printResults(1,1);
        printResults(2,1);
        printResults(1,-1);
        printResults(-1,2);
        printResults(25,20);
        printResults(1300,300);
    }
    public static double function(int t, int l){
        double sum = 0;
        for(int i=0;i<t;i++){
            if(l % 2 ==1){
                sum = sqrt(t*l);
            }else{
                sum = l / sqrt(t);
            }
        }return sum;
    }
    static void printResults(int t,int l){
        System.out.println("t:" + t + "l:" + l + "result:" + function(t,l));

    }
}
