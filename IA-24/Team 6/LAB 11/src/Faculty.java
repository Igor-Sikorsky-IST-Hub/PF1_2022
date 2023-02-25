import java.util.*;

public class Faculty{
    private String name;
    public  Integer size;
    private TreeSet<Student> FacStudents = new TreeSet<Student>();

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public TreeSet<Student> getStudents() {
        return FacStudents;
    }
    
    public void addStudent(Student newstudent) {
    	FacStudents.add(newstudent);
    }
    
    public int getSize() {
        return FacStudents.size();
    }
    
}