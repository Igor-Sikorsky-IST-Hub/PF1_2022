import java.util.HashSet;
import java.util.Set;

public class Company {
    private String name;
    private Employer head;
    private Set<Department> departmets = new HashSet<>();

    Company(String name, Employer head, Set<Department> departments) {
        this.name = name;
        this.head = head;
        this.departmets = departments;
    }

    Company(String name, Employer head) {
        this.name = name;
        this.head = head;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getHead() {
        return head;
    }

    public void setHead(Employer head) {
        this.head = head;
    }

    public Set<Department> getDepartmets() {
        return this.departmets;
    }

    public void setDepartmets(Set<Department> departmets) {
        this.departmets = departmets;
    }
}