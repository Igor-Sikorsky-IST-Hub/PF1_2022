import java.util.Set;

public class Department {

    String name;

    Employee head;

    Set<Employee> employees;

    public Department(String name, Employee head, Set<Employee> employee) {
        this.name = name;
        this.head = head;
        this.employees = employee;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public Employee getHead() {
        return head;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", head=" + head +
                ", employee=" + employees +
                '}';


    }
}
