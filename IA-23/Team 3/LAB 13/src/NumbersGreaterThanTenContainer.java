import java.util.List;

public class NumbersGreaterThanTenContainer {
    List<Integer> container;
    NumbersGreaterThanTenContainer (List<Integer> container) throws TooBigNumberExpression {
        for (Integer number: container) {
            if (number > 10) {
                throw new TooBigNumberExpression("Container can't contain number lower than 10");
            }
        }
        this.container = container;
    }

    @Override
    public String toString() {
        return container.toString();
    }
}
