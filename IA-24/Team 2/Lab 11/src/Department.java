import java.util.Set;
import java.util.TreeSet;

public class Department implements Comparable<Department>{
    private final String name;
    private final Employer manager;
    private final Set<Employer> employers= new TreeSet<>();

    Department(String name, Employer manager, Set<Employer> employers){
        this.name = name;
        this.manager = manager;
    }

    Department(String name, Employer manager){
        this.name = name;
        this.manager = manager;
    }

    public String getName(){
        return this.name;
    }



    public Employer getManager(){
        return manager;
    }


    public Set<Employer> getEmployers(){
        return this.employers;
    }



    @Override
    public String toString() {
        return "Department name: '" + name + '\'';
    }

    @Override
    public int compareTo(Department o) {
        if(this.employers.size() == o.employers.size()){
            return 0;
        } else if(this.employers.size() < o.employers.size()){
            return -1;
        } else {
            return 1;
        }
    }

}
