import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Institute {
    String name;
    List<Institute> institute = new ArrayList<Institute>();

    List<Student> students = new ArrayList<Student>();

    public void addStudents(Collection<Student> studentCollection){
        this.students.addAll(studentCollection);
    }
}
