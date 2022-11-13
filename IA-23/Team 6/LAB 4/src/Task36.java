import java.util.Arrays;

public class Task36 {

    public static void main(String[] args) {
        //№36. Визначити середнє геометричне номерів максимального та мінімального елементів масиву
        int[] array = {10, 12, 3, -18, 4, 6, 11, 8}; //Масив з від'ємними і додатними елементами
        Arrays.sort(array);
        int len = array.length;
        double sg = Math.pow(array[0]*array[len-1], 1./2);

        try {
            System.out.println("Cереднє геометричне: " + sg );
        }
        catch(IllegalArgumentException e){
            System.out.println("EXCEPTION! " + e.getMessage());
        }

        System.out.println();

        int[] array1 = {10, 12, 3, 18, 4, 6, 11, 8}; //Масив додатних чисел
        Arrays.sort(array1);
        int len1 = array1.length;
        double sg1 = Math.pow(array1[0]*array1[len-1], 1./2);

        try {
            System.out.println("Cереднє геометричне: " + sg1 );
        }
        catch(IllegalArgumentException e){
            System.out.println("EXCEPTION! " + e.getMessage());
        }

    }

}