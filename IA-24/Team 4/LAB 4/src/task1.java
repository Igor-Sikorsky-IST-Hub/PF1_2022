public class task1 {
    public static void main(String[] args) {
        int[] array = {1, 3, -14, -1, -3, 17};
        int[] array2 = {1, 3, -14, -1, -3, 17, -5, -19};
        System.out.println("Кількість відємних елементів: " + coutNecative(array));
        System.out.println("Кількість відємних елементів: " + coutNecative(array2));
    }
    public static int coutNecative(int[] array){
        int negative = 0;
        for(int i = 0; i < array.length; i++){
            if (array[i] < 0){
                negative++;
            }
        }
        return negative;
    }
}