import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>(new SalaryComparator());
        set.add(12000);
        set.add(19000);
        set.add(17000);
        set.add(34000);
        set.add(20000);
        set.add(30000);
        set.add(15000);
        set.add(18000);
        set.add(24000);
        set.add(31000);
        set.add(35000);
        set.add(32000);
        set.add(45000);

        System.out.println(set);
    }
}
class SalaryComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {

        return o1.compareTo(o2);
    }
}