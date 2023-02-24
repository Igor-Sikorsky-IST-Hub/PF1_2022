import java.util.*;
import java.util.Arrays;


public class Main implements Comparable<Faculty> {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {
        Institute inst = new Institute();

        Set<Student> fiot = new TreeSet<>();
        Set<Student> fsp = new TreeSet<>();
        Set<Student> fbmi = new TreeSet<>();


        Student student1 = new Student("Andrii", "Tiuska", 26, 80.3);
        Student student2 = new Student("Maxim", "Khokhol", 5, 98.7);
        Student student3 = new Student("David", "Pozhar", 25, 96.5);
        Student student4 = new Student("Yevhenii", "Voroniuk", 12, 95);
        Student student5 = new Student("Vadim", "Voloshyn", 34, 100);
        Student student6 = new Student("Serhii", "Kalyna", 19, 87);

        fiot.add(student1);
        fiot.add(student2);
        fiot.add(student3);
        fsp.add(student4);
        fsp.add(student5);
        fbmi.add(student6);

        Faculty Fiot = new Faculty("FIOT");
        Faculty Fsp = new Faculty("FSP");
        Faculty Fbmi = new Faculty("FBMI");
        Fiot.countOfStudents = fiot.size();
        Fsp.countOfStudents = fsp.size();
        Fbmi.countOfStudents = fbmi.size();

        TreeSet<Faculty> faculties = new TreeSet<>();

        faculties.add(Fiot);
        faculties.add(Fsp);
        faculties.add(Fbmi);


        inst.addStudents(Arrays.asList(student1, student2, student3, student4, student5, student6));


        System.out.print("Students with an average mark of 95-100 ");
        System.out.println(ANSI_RED + "(Sorting from 100 to 95) *Interface Comparable*" + ANSI_RESET);
        task3(inst);

        System.out.println("Total amount of all students in institute");
        System.out.println(task1(inst));

        System.out.print("the largest count of students in ");
        System.out.println(ANSI_RED + faculties.last() + " *Interface Comparator*" + ANSI_RESET);



    }

    public static void task3(Institute institute) {
        for (Student x : institute.students) {
            if (x.averageMark >= 95) {
                System.out.print(x.name + " " + x.surname);
                System.out.println(" ");
            }
        }
    }

    public static int task1(Institute institute) {
        int count = 0;
        Iterator<Student> iterator = institute.students.iterator();

        while (iterator.hasNext()) {
            count++;
            iterator.next();
        }

        return count;
    }


    @Override
    public int compareTo(Faculty o) {
        return 0;
    }
}
