import java.util.Set;

public class Firm {
    String name;
    Employee head;
    Set<Department> departments;

    public Firm(String name, Employee head, Set<Department> department) {
        this.name = name;
        this.head = head;
        this.departments = department;
    }

    public String getName() {
        return name;
    }

    public Employee getHead() {
        return head;
    }

    public Set<Department> getDepartments() {
        return departments;
    }
}
