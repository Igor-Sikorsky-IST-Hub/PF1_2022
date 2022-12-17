
public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        System.out.println("Застосуємо стратегiю сортування Вибором");
        context.SetStrategy(new SelectionSort());
        context.UseSortStrategy();

        System.out.println();

        System.out.println("Застосуємо стратегiю сортування Бульбашкою");
        context.SetStrategy(new BubbleSort());
        context.UseSortStrategy();

        System.out.println();
        
        System.out.println("Застосуємо стратегiю сортування Включенням");
        context.SetStrategy(new InsertionSort());
        context.UseSortStrategy();
    }
}