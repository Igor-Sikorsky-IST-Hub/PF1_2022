import java.util.HashSet;
import java.util.Set;

public class Department {
    private String name;
    private Employer manager;
    private Set<Employer> employers = new HashSet<>();

    Department(String name, Employer manager, Set<Employer> employers) {
        this.name = name;
        this.manager = manager;
        this.employers = employers;
    }

    Department(String name, Employer manager) {
        this.name = name;
        this.manager = manager;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getManager() {
        return manager;
    }

    public void setManager(Employer manager) {
        this.manager = manager;
    }

    public Set<Employer> getEmployers() {
        return this.employers;
    }

    public void setEmployers(Set<Employer> employers) {
        this.employers = employers;
    }
}