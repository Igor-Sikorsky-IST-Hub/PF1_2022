import java.util.*;
public class Faculty{
    HashSet<Student> space;
    Integer quantity;
    static HashSet<Student> allStudents = new HashSet<>();

    public Faculty(HashSet<Student> space, Integer quantity){
        this.space = space;
        this.quantity = quantity;
    }
    public static HashSet<Student> getAllStudents() {
        return allStudents;
    }
}


