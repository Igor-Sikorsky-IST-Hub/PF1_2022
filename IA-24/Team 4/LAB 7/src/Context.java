import java.util.Arrays;

public class Context {
    private ISortStrategy sortStrategy;

    Context() {

    }

    // Стратегiю сортування передаємо для контексту через конструктор
    public Context(ISortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    // Залишаэмо можливiсть змiнювати стратегiю пiд час виконання програми
    public void SetStrategy(ISortStrategy strategy) {
        this.sortStrategy = strategy;
    }

    // Сортуємо використовуючи вибрану стратегiю
    public void UseSortStrategy() {
        float[] array = { 1.5f, 6.0f, 3.3f, 15.8f, 29.2f, 4.1f, 8.7f };
        this.sortStrategy.Sort(array);
        System.out.println(Arrays.toString(array));
    }
}
