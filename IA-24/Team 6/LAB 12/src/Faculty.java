import java.util.*;

public class Faculty{
    private String name;
    public  Integer size;
    private HashSet<Student> FacStudents = new HashSet<Student>();

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public HashSet<Student> getStudents() {
        return FacStudents;
    }
    
    public void addStudent(Student newstudent) {
    	FacStudents.add(newstudent);
    }
    
    public int getSize() {
        return FacStudents.size();
    }
}