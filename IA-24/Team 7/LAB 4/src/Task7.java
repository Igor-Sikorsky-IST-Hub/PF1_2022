public class Task7{
    public static void printResult(int b[]){
        //виводимо массив у один рядок
        for (int i = 0; i < b.length; i++){
            System.out.print(b[i] + " ");
        }
        System.out.println();

        int sum = 0;
        //проходжуся по масиву
        for (int i = 0; i < b.length; i++){
            //Перевірка на кратність
            if (b[i]%2==0){
                //Додаємо 1 до змінної суми в випадку кратності
                sum++;
            }
        }
        //Виводимо результат
        System.out.println(sum);
    }


    public static void main(String[] args) {
        //  Створюємо та заповнюємо масив
        int[] b = new int [30];
        for (int i = 0; i< b.length ; i++){
            b[i] = i;
        }
        printResult(b);
    }
}