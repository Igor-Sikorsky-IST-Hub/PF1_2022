public class Lab9_task3 {
    public static void main(String[] args) {
        printResults(215);
        printResults(49678798);
        printResults(Integer.MAX_VALUE);
        printResults(-560);
    }

    private static double printResults(int  number ){
        try {
            System.out.println(intToOctString(number));
        }catch (NumberFormatException e){
            System.out.println("Число задано не вірно");
        }
    return 0;
    }


    static String intToOctString(int number){
        String octalNumber = "";
        if (number <= 0 | number==Integer.MAX_VALUE | number==Integer.MIN_VALUE) {
           throw new NumberFormatException();
        }

        int k = 0;
        int octo =0 ;
        while (number != 0) {
            octo = (int) (octo + (number % 8) * Math.pow(10, k++));
            number = number / 8;
        }
        octalNumber= octo + "";
        return octalNumber;
    }
}