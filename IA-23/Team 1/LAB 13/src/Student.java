import java.util.Objects;

public class Student{
    String name;
    String surname;
    String id;
    double averageMark;

    public Student(String name, String surname, String id, double averageMark){
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.averageMark = averageMark;

    }

    @Override
    public boolean equals(Object anotherObject){
        if(this == anotherObject) return true;
        if (anotherObject == null || getClass() != anotherObject.getClass()) return false;
        Student student = (Student) anotherObject;
        return id.equals(student.id);
    }
    @Override
    public int hashCode(){
        return Objects.hash(id);
    }
}
