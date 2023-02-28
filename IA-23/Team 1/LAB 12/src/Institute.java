import java.util.*;

public class Institute {

    HashSet<Student> students = new HashSet<>();


    public void addStudents(Collection<Student> studentCollection){
        this.students.addAll(studentCollection);
    }
}
