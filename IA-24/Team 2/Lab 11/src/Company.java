import java.util.Set;
import java.util.TreeSet;

public class Company {
    private final String name;
    private final Employer head;
    private final Set<Department> departments = new TreeSet<>();

    Company(String name, Employer head, Set<Department> departments){
        this.name = name;
        this.head = head;
    }

    Company(String name, Employer head){
        this.name = name;
        this.head = head;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
    }

    public Employer getHead(){
        return head;
    }

    public void setHead(Employer head){
    }

    public Set<Department> getDepartments() {
        return departments;
    }

    @Override
    public String toString() {
        return "name: " + name;
    }

    public void setDepartments(Set<Department> departments) {
    }
}
