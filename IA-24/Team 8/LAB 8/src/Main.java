package lab8;

import javax.print.Doc;

public class Main {
    public static void main(String[] args) {
        Document document = new Document();
        System.out.println(document);

        Document document1 = new Document("Lab8", 1024);
        System.out.println(document1);
        document1.setName("p1-lab-08");
        System.out.println("Renamed to "+document1.getName());

        TextDocument textDocument = new TextDocument();
        System.out.println( textDocument);
        TextDocument textDocument1 = new TextDocument("Lab9",  "My task",
                "A constructor in Java is a special method that is used to initialize objects");
        System.out.println(textDocument1);


    }

}
