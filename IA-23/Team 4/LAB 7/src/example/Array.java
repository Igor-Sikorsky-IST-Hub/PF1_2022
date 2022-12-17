package example;

public class Array {
    private final Strategy strategy;

    public Array(Strategy strategy) {
        this.strategy = strategy;
    }

    public void sort(float[] array) {
        strategy.sort(array);
    }

    public void toString(float[] array) {
        for (float i : array) {
            System.out.print(i + " ");
        }
    }
}
