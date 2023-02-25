import java.util.*;

public class Student implements Comparable<Student> {
    private String name;
    private String surname;
    private int number;
    private double mark;

    public Student(String name, String surname, int number, double mark) {
        this.name = name;
        this.surname = surname;
        this.number = number;
        this.mark = mark;
    }
    
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getNumber() {
        return number;
    }
    
    public double getMark() {
        return mark;
    }
    
    public String toString() {
        return  "Студент " + name + " " + surname + "\nНомер залікової книжки " + number + "\nСередній бал " + mark;
    }
    
    @Override
    public int compareTo(Student other) {
        int result = Double.compare(this.mark, other.mark);
        if (result != 0) {
            return result;
        }
        return this.surname.compareTo(other.name);
    } 
}