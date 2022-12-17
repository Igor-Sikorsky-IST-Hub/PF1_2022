public class Task37 {
    public static void calculation(int b[]){
        int sum = 0;
        //виводимо массив у один рядок
        for (int i = 0; i < b.length; i++){
            System.out.print(b[i] + " ");
        }
        System.out.println();
        //проходжуся по масиву
        for(int i: b){
            //перевірка на кратність
            if ((i%3==0)&&(i != 0)){
                sum += b[i];
                System.out.println(b[i]);
            }
        }
        // Виводимо суму
        System.out.println("Сума: "+sum);
    }

    public static void main(String[] args) {
        int sum = 0;
        //створюю масив
        int[] b = new int [22];
        for (int i = 0; i< b.length ; i++){
            b[i] = i+1;
        }
        //використовуємо метод
        calculation(b);
    }

}