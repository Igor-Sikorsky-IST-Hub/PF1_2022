import java.util.Comparator;

public class CompareDepartment implements Comparator<Department> {


    @Override
    public int compare(Department o1, Department o2) {
        return o1.employees.size()-o2.employees.size();
    }
}
