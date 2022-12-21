import java.util.*;

public class Main {
    public static void main(String[] args) {
        task2();
    }
    public static void task1 (){
        dataManager();
        System.out.println(fiot.students.size() + fict.students.size());
    }
    public static void task2(){
        dataManager();
        System.out.println(fiot.students.size());
    }
    static void dataManager(){
        Institute inst = new Institute();
        Faculty fiot = new Faculty();
        Faculty fict = new Faculty();
        Student student1 = new Student("Anton", "Chaika", 2365, 86.5);
        Student student2 = new Student("Danya", "Yablonskiy", 2215, 90.3);
        Student student3 = new Student("Dariya", "Sidenko", 2615, 77.5);
        Student student4 = new Student("Anton", "Shkarnikov", 2165, 88.7);
        Student student5 = new Student("Roma", "Krasnoshapka", 1788, 92.5);
        fiot.addStudents(Arrays.asList(student1,student2,student3));
        fict.addStudents(Arrays.asList(student4,student5));
    }
}