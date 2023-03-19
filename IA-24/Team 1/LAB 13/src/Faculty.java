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
    public static void addStudent(Student student, HashSet<Student> faculty) throws FacultyException {
        try{
            if (faculty.size() >= 6) {
                throw new ArrayIndexOutOfBoundsException("Can't add " + student.fullName() + " - faculty is full");
            } else {
                if (student.getAverageMark() < 30) {
                    throw new FacultyException(student.fullName() + " failed the session.");
                } else if (student.getAverageMark() > 30 & student.getAverageMark() < 60) {
                    throw new FacultyException( student.fullName() + " needs to pass the exam.");
                } else if (student.getAverageMark() > 100 || student.getAverageMark() < 0) {
                    throw new IllegalArgumentException("Invalid data given.");
                } else if (student.getSurname() == null || student.getName() == null) {
                    throw new IllegalArgumentException("Not all data given.");
                } else {
                    faculty.add(student);
                }
            }
        } catch (FacultyException | IllegalArgumentException | ArrayIndexOutOfBoundsException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}


