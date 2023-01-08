import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        printResult(" “The user with the nickname koala757677 this month wrote 3 times more comments than the user with the nickname croco181dile920 4 months ago”");
        printResult("2005 is a best year!");
        printResult("Elon Musk was born in 1971");
        printResult("Hello World !");
    }

    public static int quantityOfNumbers(String text){
        int quantity = 0;
        Pattern pattern = Pattern.compile("^[0-9]+\s|\s[0-9]\s|\s[0-9]{1,}$");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            quantity += 1;
        }
        return quantity;
    }
    public static void printResult(String text){
        System.out.println(text);
        if(quantityOfNumbers(text)!=0){
            System.out.println("Кількість чисел у реченні:" + quantityOfNumbers(text));
            System.out.println();
        }
        else{
            throw new IllegalArgumentException("Number was not found");
        }
    }

}