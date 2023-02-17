import java.util.*;
public class Faculty implements Comparable<Faculty>{
    String name;
    Integer quantity;
    TreeSet<Student> space;
    public static TreeSet<Student> allStudents = new TreeSet<>(new Student.markComparator());
    public Faculty(String name, Integer quantity, TreeSet<Student> space){
        this.name = name;
        this.quantity = quantity;
        this.space = space;
    }

    public int compareTo(Faculty other) {
        int result = this.quantity.compareTo(other.quantity);
        if (result != 0){
            return result;
        }
        return this.quantity.compareTo(other.quantity);
    }
    public static TreeSet<Student> getAllStudents() {
        return allStudents;
    }

    public void addStudents(TreeSet<Student> students){
        allStudents.addAll(students);
    }

    public String toString(){
        return name;
    }
}

