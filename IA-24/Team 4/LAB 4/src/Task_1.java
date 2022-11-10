
public class Task_1 {
    public static void main(String[] args) {
        int[] array1 = {1, -14, -1, 17};
        int[] array2 = {1, 3, -14, -1, -3, 17};
        int[] array3 = {1, 3, -14, -1, -3, 17, -5, -19};

        System.out.println("Кількість відємних елементів: " + coutNecative(array1));
        System.out.println("Кількість відємних елементів: " + coutNecative(array2));
        System.out.println("Кількість відємних елементів: " + coutNecative(array3));
    }
    // Знайти кількість від’ємних елементів
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
