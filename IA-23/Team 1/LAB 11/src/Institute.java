import java.util.*;

public class Institute implements Comparable<Institute> {

    Set<Student> students = new TreeSet<>();

    public void addStudents(Collection<Student> studentCollection){

        this.students.addAll(studentCollection);
    }

    @Override
    public int compareTo(Institute o) {
        return 0;
    }
}
