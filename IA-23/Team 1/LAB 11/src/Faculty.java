import java.util.*;

public class Faculty  extends  Institute implements Comparator<Faculty>{
    int countOfStudents;
    String FacultyName;

    public Faculty(String facultyName) {
        FacultyName = facultyName;
    }

    @Override
    public int compare(Faculty o1, Faculty o2) {
        if(o1.countOfStudents == o2.countOfStudents){
            return 0;
        } else if(o1.countOfStudents > o2.countOfStudents){
            return 1;
        } else {
            return -1;
        }
    }

    Set<Student> students = new TreeSet<>();


    public void addStudents(Collection<Student> studentCollection){
        this.students.addAll(studentCollection);
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "countOfStudents=" + countOfStudents +
                ", FacultyName='" + FacultyName + '\'' +
                '}';
    }
}
