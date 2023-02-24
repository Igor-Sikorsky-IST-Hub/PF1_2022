import java.util.*;

public class Main {
    public static void main(String[] args) {
        dataBase();
        task1();
        task2(Institute.getAllFaculties());
        task3();
    }

    static void task1() {
        System.out.println("Number of students in institute:");
        int allSt = 0;
        for (Iterator i = Faculty.getAllStudents().iterator(); i.hasNext(); ) {
            i.next();
            allSt++;
        }
        System.out.println(allSt);
    }
    static void task2(HashMap<Integer, String> map) {
        System.out.println("The most popular faculty:");
        Integer val = 0;
        HashSet<Integer> num = new HashSet<>();
        for (Map.Entry<Integer, String> entryKey : Institute.getAllFaculties().entrySet()) {
            num.add(entryKey.getKey());
            for (Integer i : num) {
                if (val < i) {
                    val = i;
                }
            }
        }
        System.out.println(map.remove(val));
    }
    static void task3() {
        System.out.println("Students with average mark in range of 95-100");
        HashSet<Student> stud = new HashSet<Student>();
        for (Student i : Faculty.getAllStudents()) {
            if (i.getAverageMark() >= 95 & i.getAverageMark() <= 100) {
                stud.add(i);
            }
        }
        for (Student i : stud) {
            System.out.println(i.fullName());
        }
    }
    public static void dataBase() {
        Student student1 = new Student("Anton", "Chayka", 10001, 96);
        Student student2 = new Student("Daria", "Sidenko", 10002, 95);
        Student student3 = new Student("Maxim", "Kotlyarchuk", 10003, 98);
        Student student4 = new Student("Anna", "Orlovska", 10004, 90);
        Student student5 = new Student("Yulia", "Meleshko", 10005, 89);
        Student student6 = new Student("Danya", "Yablonskiy", 10006, 99.5);

        HashSet<Student> fpmSpace = new HashSet<>();
        fpmSpace.add(student5);
        fpmSpace.add(student6);

        HashSet<Student> fictSpace = new HashSet<>();
        fictSpace.add(student1);
        fictSpace.add(student2);
        fictSpace.add(student3);
        fictSpace.add(student4);

        Faculty.getAllStudents().addAll(fictSpace);
        Faculty.getAllStudents().addAll(fpmSpace);

        Institute.getAllFaculties().put(fpmSpace.size(), "FPM");
        Institute.getAllFaculties().put(fictSpace.size(), "FICT");
    }
}
