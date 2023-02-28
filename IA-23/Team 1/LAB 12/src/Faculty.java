import java.util.*;

public class Faculty  extends  Institute{
    String idFaculty;
    String nameFaculty;

    public Faculty(String idFaculty, String nameFaculty){
        this.idFaculty = idFaculty;
        this.nameFaculty = nameFaculty;
    }
    public void addStudents(Collection<Student> studentCollection){
        this.students.addAll(studentCollection);
    }

    @Override
    public String toString(){
        return "Faculty name is " + nameFaculty + ". The Faculty ID: " + idFaculty;
    }
}
