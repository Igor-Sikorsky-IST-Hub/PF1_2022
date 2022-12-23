package strategy;

public class SortMethod {
    private Method method;

    public void setMethod(Method method) {
        this.method = method;
    }

    public long[] executeMethod(long[] array) {
        return method.sort(array);
    }
}
