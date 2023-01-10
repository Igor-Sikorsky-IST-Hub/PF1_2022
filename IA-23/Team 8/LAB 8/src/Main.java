import javax.print.Doc;
public class Main {
    public static void main(String[] args) {
        Document document = new Document();
        System.out.println(document);

        Document document1 = new Document("Lab", 2048);
        System.out.println(document1);
        document1.setName("LAB");
        System.out.println("Перейменовано на "+document1.getName());

        Text_Doc textDocument = new Text_Doc();
        System.out.println( textDocument);
        Text_Doc textDocument1 = new Text_Doc("Lab",  "Моє завдання",
                "Конструктор в Java - це спеціальний метод, який використовується для ініціалізації об'єктів");
        System.out.println(textDocument1);


    }

}