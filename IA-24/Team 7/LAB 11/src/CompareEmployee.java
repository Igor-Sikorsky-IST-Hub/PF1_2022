import java.util.Comparator;

public class CompareEmployee implements Comparator<Employee> {
    @Override
    public int compare(Employee a1, Employee a2){

        return a1.salary-a2.salary;
    }

}
