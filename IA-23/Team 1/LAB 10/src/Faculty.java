import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Faculty  extends  Institute{
    String name;
    List<Student> students = new ArrayList<Student>();


    public void addStudents(Collection<Student> studentCollection){
        this.students.addAll(studentCollection);
    }
}
