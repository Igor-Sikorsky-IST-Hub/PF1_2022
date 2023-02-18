import java.util.TreeSet;
import java.util.Comparator;
import java.util.Iterator;

public class Task6_Lab11 {

    public static void main(String[] args) {
        Institut institut = new Institut("KPI", Algoritm.c);
        Fakultet fakultet = new Fakultet("ABCD");
        fakultet.addStudent(new Student("Ivan", "Ivanov", 1, 80));
        fakultet.addStudent(new Student("Petr", "Kozlov", 2, 96));
        institut.addFakultet(fakultet);
        fakultet = new Fakultet("TYRE");
        fakultet.addStudent(new Student("Alex", "Kovalenko", 3, 75));
        fakultet.addStudent(new Student("Olga", "Petrenko", 4, 88));
        fakultet.addStudent(new Student("Nina", "Dimitradze", 50, 96.5));
        institut.addFakultet(fakultet);
        fakultet = new Fakultet("BRICK");
        fakultet.addStudent(new Student("Alex", "Kovalenko", 13, 100));
        fakultet.addStudent(new Student("Kostik", "Malyshev", 44, 95));
        fakultet.addStudent(new Student("Dima", "Kabanov", 11, 65));
        institut.addFakultet(fakultet);

        // використані ітератори та цикли з лаб10
        System.out.println("Total students: " + institut.getStudQuontity());

        // використаний компаратор по двом властивостям факультетів:
        // 1) кількість студентів; 2) найменування факультету
        System.out.println("Biggest fakultet: " + institut.getBiggestFakultet());

        // використаний фіктивний студент з єдиним реквізитом - averGrad - виключно для
        // відбору діапазону 95...100 за допомогою інтерфейсу Comparable
        System.out.println("Excellent students: " + institut.getExcellentStudents());
    }

}

// варіанти алгоритмів
// a - нетипізований ітератор
// b - типізований ітератор
// c - типізований цикл «for-each»
enum Algoritm {
    a, b, c;
}

class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
    private int nomZK;
    private double averGrad;

    Student(String firstName, String lastName, int nomZK, double averGrad) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nomZK = nomZK;
        this.averGrad = averGrad;
    }

    @Override
    public String toString() {
        return "\nstudent " + firstName + " " + lastName + ", nom zal. " + nomZK + ", aver. grad " + averGrad;
    }

    @Override
    public int compareTo(Student s) {
        int result = Double.compare(this.averGrad, s.averGrad);
        if (result != 0) {
            return result;
        }
        return this.lastName.compareTo(s.lastName);
    }
}

class Fakultet {
    private String name;
    private TreeSet<Student> students = new TreeSet<Student>();

    Fakultet(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public int getStudQuantity() {
        return students.size();
    }

    @Override
    public String toString() {
        return name;
    }

    public TreeSet<Student> getAllStudents() {
        return students;
    }
}

class Institut {
    public static final ComparatorStudQuant COMPARATOR_STUD_QUANT = new ComparatorStudQuant();
    private String name;
    private TreeSet<Fakultet> fakultets = new TreeSet<Fakultet>(Institut.COMPARATOR_STUD_QUANT);
    private Algoritm algoritm;

    Institut(String name, Algoritm algoritm) {
        this.name = name;
        this.algoritm = algoritm;
    }

    public void addFakultet(Fakultet fakultet) {
        fakultets.add(fakultet);
    }

    public int getStudQuontity() {
        int result = 0;
        if (algoritm == Algoritm.a) {
            for (Iterator i = fakultets.iterator(); i.hasNext();) {
                Object o = i.next();
                Fakultet fakultet = (Fakultet) o;
                result += fakultet.getStudQuantity();
            }
        } else if (algoritm == Algoritm.b) {
            for (Iterator<Fakultet> i = fakultets.iterator(); i.hasNext();) {
                Fakultet fakultet = i.next();
                result += fakultet.getStudQuantity();
            }
        } else if (algoritm == Algoritm.c) {
            for (Fakultet fakultet : fakultets) {
                result += fakultet.getStudQuantity();
            }
        }
        return result;
    }

    public Fakultet getBiggestFakultet() {
        return fakultets.last();
    }

    public static class ComparatorStudQuant implements Comparator<Fakultet> {
        @Override
        public int compare(Fakultet fakultet_left, Fakultet fakultet_right) {
            int result = Integer.compare(fakultet_left.getStudQuantity(), fakultet_right.getStudQuantity());
            if (result != 0) {
                return result;
            }
            return fakultet_left.toString().compareTo(fakultet_right.toString());
        }
    }

    public TreeSet<Student> getExcellentStudents() {
        TreeSet<Student> result = new TreeSet<Student>();
        if (algoritm == Algoritm.a) {
            for (Iterator i = fakultets.iterator(); i.hasNext();) {
                Object o = i.next();
                Fakultet fakultet = (Fakultet) o;
                result.addAll(fakultet.getAllStudents());
            }
        } else if (algoritm == Algoritm.b) {
            for (Iterator<Fakultet> i = fakultets.iterator(); i.hasNext();) {
                Fakultet fakultet = i.next();
                result.addAll(fakultet.getAllStudents());
            }
        } else if (algoritm == Algoritm.c) {
            for (Fakultet fakultet : fakultets) {
                result.addAll(fakultet.getAllStudents());
            }
        }
        return (TreeSet) result.tailSet(new Student("Just", "for_comparison", 0, 94.9));
    }
}
