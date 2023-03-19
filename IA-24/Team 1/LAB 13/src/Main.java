import java.util.*;


public class Main {
    public static void main(String[] args) throws FacultyException {
        dataBase();
        task1();
        task2(Institute.getAllFaculties());
        task3();
    }

    static void task1() {
        System.out.println("Number of students in institute:");
        int allSt = 0;
        for (Iterator<Student> i = Faculty.getAllStudents().iterator(); i.hasNext(); ) {
            i.next();
            allSt++;
        }
        System.out.println(allSt);
    }

    static void task2(HashMap<Integer, String> map) {
        System.out.println("--------------------------------------");
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
        System.out.println("--------------------------------------");
        System.out.println("Students with average mark in range of 95-100");
        HashSet<Student> stud = new HashSet<>();
        for (Student i : Faculty.getAllStudents()) {
            if (i.getAverageMark() >= 95 && i.getAverageMark() <= 100) {
                stud.add(i);
            }
        }
        for (Student i : stud) {
            System.out.println(i.fullName());
        }
    }

    public static void dataBase() throws FacultyException {
        Student student1 = new Student("Anton", "Chayka", "10001", 96);
        Student student2 = new Student("Daria", "Sidenko", "10002", 95);
        Student student3 = new Student("Maxim", "Kotlyarchuk", "10003", 98);
        Student student4 = new Student("Anna", "Orlovska", "10004", 90);
        Student student5 = new Student("Yulia", "Meleshko", "10005", 89);
        Student student6 = new Student("Danya", "Yablonskiy", "10006", 99.5);
        Student student7 = new Student("Sanya", null, "10007", 67);
        Student student8 = new Student("Artem", "Kliminskiy", "10008", 58);
        Student student9 = new Student("Ivan", "Paliychuk", "10009", 27);
        Student student10 = new Student("Sergiy", "Ivanov", "100010", 105);
        Student student11 = new Student("Kostya", "Isaev", "10011", 83);
        Student student12 = new Student("Roman", "Krasnoshapka", "10012", 19);

        HashSet<Student> fictSpace = new HashSet<>();
        HashSet<Student> fpmSpace = new HashSet<>();

        Faculty.addStudent(student1, fictSpace);
        Faculty.addStudent(student2, fictSpace);
        Faculty.addStudent(student3, fictSpace);
        Faculty.addStudent(student4, fictSpace);
        Faculty.addStudent(student5, fictSpace);
        Faculty.addStudent(student11, fictSpace);
        Faculty.addStudent(student6, fpmSpace);
        Faculty.addStudent(student7, fpmSpace);
        Faculty.addStudent(student8, fpmSpace);
        Faculty.addStudent(student9, fpmSpace);
        Faculty.addStudent(student10, fictSpace);
        Faculty.addStudent(student12, fictSpace);

        System.out.println("--------------------------------------");

        Faculty.getAllStudents().addAll(fictSpace);
        Faculty.getAllStudents().addAll(fpmSpace);
        Institute.getAllFaculties().put(fpmSpace.size(), "FPM");
        Institute.getAllFaculties().put(fpmSpace.size(), "FIOT");

    }
}