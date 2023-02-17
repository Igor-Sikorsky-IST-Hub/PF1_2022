import java.util.*;

public class Main {
    public static void main(String[] args) {
        dataBase();
        task1();
        task2();
        task3();
    }
    public static void task1(){
        System.out.println("Number of students in institute:");
        System.out.println(Faculty.getAllStudents().size());
    }
    public static void task2(){
        System.out.println("The most popular faculty:");
        System.out.println(Institute.getAllFaculties().last());
    }
    public static void task3(){
        Student studentMin = new Student("minMark", "forA", 10000, 95);
        Student studentMax = new Student("maxMark", "forA", 10007, 100);
        System.out.println("Students with average mark in range of 95-100");
        NavigableSet<Student> stud = Faculty.getAllStudents().subSet(studentMin, true, studentMax, true);
        for (Student i : stud) {
            System.out.println(i.toString());
        }
    }
    public static void dataBase(){
        Student student1 = new Student("Anton", "Chayka", 10001, 96);
        Student student2 = new Student("Daria", "Sidenko", 10002, 95);
        Student student3 = new Student("Maxim", "Kotlyarchuk", 10003, 98);
        Student student4 = new Student("Anna", "Orlovska", 10004, 90);
        Student student5 = new Student("Yulia", "Meleshko", 10005, 89);
        Student student6 = new Student("Danya", "Yablonskiy", 10006, 99.5);

        TreeSet<Student> fictSpace = new TreeSet<>(new Student.markComparator());
        fictSpace.add(student1);
        fictSpace.add(student2);
        fictSpace.add(student3);
        fictSpace.add(student4);
        Faculty fict = new Faculty("FICT", fictSpace.size(), fictSpace);

        TreeSet<Student> fpmSpace = new TreeSet<>(new Student.markComparator());
        fpmSpace.add(student5);
        fpmSpace.add(student6);
        Faculty fpm = new Faculty("FPM", fpmSpace.size(), fpmSpace);

        Faculty.getAllStudents().addAll(fictSpace);
        Faculty.getAllStudents().addAll(fpmSpace);

        Institute inst = new Institute("KPI");

        inst.addFaculties(fict);
        inst.addFaculties(fpm);

    }
}

