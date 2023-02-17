import java.util.*;
public class Student {
    private String name;
    private String surname;
    private Integer number;
    private double averageMark;

    public Student(String name, String surname, int number, double averageMark) {
        this.name = name;
        this.surname = surname;
        this.number = number;
        this.averageMark = averageMark;
    }
    public static class markComparator implements Comparator<Student>{
        public int compare(Student student1, Student student2) {
            if (student1.getAverageMark() > student2.getAverageMark()) {
                return 1;
            }
            if (student1.getAverageMark() < student2.getAverageMark()) {
                return -1;
            }
            return 0;
        }
    }
    @Override
    public String toString() {
        return name + " " + surname;
    }
    public double getAverageMark() {
        return averageMark;
    }
}
