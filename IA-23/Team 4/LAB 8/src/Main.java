public class Main {
    public static void main(String[] args) {
        System.out.println("Перший прямокутник");
        Rectangle rectangle = new Rectangle(4, "Зелений", 12, 13);
        System.out.println(rectangle);
        System.out.println("\nПерший прямокутник, сторони якого домножені на 5");
        rectangle.Transform(5);
        System.out.println(rectangle);
        System.out.println("\nПерший прямокутник, сторони якого домножені на 5 та 4");
        rectangle = new Rectangle(4, "Зелений", 12, 13);
        rectangle.Transform(5, 4);
        System.out.println(rectangle);

        System.out.println("\nДругий прямокутник");
        Rectangle rectangle2 = new Rectangle(4, "Блакитний", 2, 3);
        System.out.println(rectangle2);

        System.out.println("\n\nПерше коло");
        Circle circle = new Circle(0, "Фіолетовий", 10, 38);
        System.out.println(circle);
        System.out.println("\nПерше коло, до радіуса якого додано 4");
        circle.Transform(4);
        System.out.println(circle);
    }
}