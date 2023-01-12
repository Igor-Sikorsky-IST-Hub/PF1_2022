import java.util.List;
import java.util.ArrayList;
public class Company {
    private String name;
    private Employer head;
    private List<Department> departmets = new ArrayList<>();

    Company(String name, Employer head, List<Department> departments){
        this.name = name;
        this.head = head;
        this.departmets = departments;
    }

    Company(String name, Employer head){
        this.name = name;
        this.head = head;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public Employer getHead(){
        return head;
    }

    public void setHead(Employer head){
        this.head = head;
    }

    public List<Department> getDepartmets(){
        return this.departmets;
    }

    public void setDepartmets(List<Department> departmets) {
        this.departmets = departmets;
    }
}
