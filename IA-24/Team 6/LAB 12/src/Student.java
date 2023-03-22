import java.util.*;

public class Student{
    private String name;
    private String surname;
    private int number;
    HashMap <String,Double> MarkMap = new HashMap<>();
    private double avaragemark;

    public Student(String name, String surname, int number, double MathMark, double OPMark, double TAMark) {
        this.name = name;
        this.surname = surname;
        this.number = number;
        MarkMap.put("Math", MathMark);
        MarkMap.put("OP", OPMark);
        MarkMap.put("TA", TAMark);
        this.avaragemark = (MathMark + OPMark + TAMark)/3;
    }
    
    public String getMarks() {
    	return "Math mark: " + MarkMap.get("Math") + "\nOP mark: " + MarkMap.get("OP") + "\nTA mark: " + MarkMap.get("TA");
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
    
    public double getvArageMark() {
        return avaragemark;
    }
    
    public String toString() {
        return  "Студент " + name + " " + surname + "\nНомер залікової книжки " + number + "\nСередній бал " + avaragemark;
    }
    
    @Override
    public boolean equals(Object Obj){
        if(this == Obj) {
        	return true;
        }
        if (Obj == null || getClass() != Obj.getClass()) {
        	return false;
        }
        Student student = (Student) Obj;
        if (student.getNumber() == this.number){
        	return true;
        }
        else return false;
    }
    
    @Override
    public int hashCode(){
        return Objects.hash(number);
    }
}