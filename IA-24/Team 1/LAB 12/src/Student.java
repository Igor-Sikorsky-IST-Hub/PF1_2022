import java.util.*;
public class Student {
    private String name;
    private String surname;
    private int number;
    private double averageMark;
    public Student(String name, String surname, int number, double averageMark){
        this.name = name;
        this.surname = surname;
        this.number = number;
        this.averageMark = averageMark;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (!Objects.equals(this.number, other.number)) {
            return false;
        }
        if (!Objects.equals(this.averageMark, other.averageMark)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 13;
        hash = 31 * hash * Objects.hashCode(this.number);
        hash = 31 * hash * Objects.hashCode((int) this.averageMark);
        return hash;
    }

    public String getName(){
        return  name;
    }
    public String getSurname(){
        return surname;
    }
    public int getNumber(){
        return number;
    }
    public double getAverageMark(){
        return averageMark;
    }
    public String fullName(){
        return surname + " " + name;
    }
}