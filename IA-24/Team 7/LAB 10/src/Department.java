import java.util.ArrayList;
import java.util.List;

public class Department {
    private final String nameOfDepartment;
    private final String chief;
    private List<Employee> employees = new ArrayList();

    public Department(String nameOfDepartment, String chief) {
        this.nameOfDepartment = nameOfDepartment;
        this.chief = chief;
    }

    private static final List<Employee> allEmployees = new ArrayList();
    public static void addEmployee(Employee employee) {
        allEmployees.add(employee);
    }

    public static List<Employee> getAllEmployees(){
        return allEmployees;
    }


    public String getChief() {
        return this.chief;
    }


    @Override
    public String toString() {
        return "Department(" + "Name of department=" + nameOfDepartment + ", Chief=" + chief + " )";
    }

}
