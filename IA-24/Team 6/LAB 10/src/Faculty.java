import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Faculty {
    private String name;
    private List<Student> FacStudents = new ArrayList<>();

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return FacStudents;
    }
    
    public void addStudents(Collection<Student> Students){
        this.FacStudents.addAll(Students);
    }

}