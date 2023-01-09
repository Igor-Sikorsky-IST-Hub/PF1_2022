import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private Employer manager;
    private List<Employer> employers= new ArrayList<>();

    Department(String name, Employer manager, List<Employer> employers){
        this.name = name;
        this.manager = manager;
        this.employers = employers;
    }

    Department(String name, Employer manager){
        this.name = name;
        this.manager = manager;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getManager(){
        return manager;
    }

    public void setManager(Employer manager) {
        this.manager = manager;
    }

    public List<Employer> getEmployers(){
        return this.employers;
    }

    public void setEmployers(List<Employer> employers) {
        this.employers = employers;
    }
}
