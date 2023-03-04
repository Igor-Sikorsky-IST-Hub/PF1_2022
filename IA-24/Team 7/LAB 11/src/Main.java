import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Employee i1 = new Employee("name1", "Працівник", 1000);
        Employee i2 = new Employee("name2", "Працівник", 1100);
        Set<Employee> oned = new TreeSet<>();
        oned.add(i1);
        oned.add(i2);

        Employee i3 = new Employee("name3", "Начальник", 1500);

        Employee i4 = new Employee("name4", "Директор", 2000);
        Department d1 = new Department("d1", i3, oned);
        Set<Department> onedd = new HashSet<>();
        onedd.add(d1);

        Firm f1 = new Firm("ONEO", i4, onedd);

        Employee i5 = new Employee("name5", "Працівник", 1210);
        Employee i6 = new Employee("name6", "Працівник", 1400);
        Employee i7 = new Employee("name7", "Начальник", 1300);
        Set<Employee> twod = new TreeSet<>();
        twod.add(i5);
        twod.add(i6);
        Department d2 = new Department("d2", i7, twod);

        Employee i8 = new Employee("name8", "Працівник", 1200);
        Employee i9 = new Employee("name9", "Начальник", 1350);
        Set<Employee> twof = new TreeSet<>();
        twof.add(i8);
        Department d3 = new Department("d3", i9, twof);

        Set<Department> twodd = new HashSet<>();
        twodd.add(d2);
        twodd.add(d3);

        Employee i10 = new Employee("name10", "Директор", 100);
        Firm f2 = new Firm("lik", i10, twodd);

        System.out.println("Перше завдання:");
        OnePrintResult(f1);
        OnePrintResult(f2);
        System.out.println();
        System.out.println("Друге завдання:");
        TwoPrintResult(f1);
        TwoPrintResult(f2);
        System.out.println();
        System.out.println("Третє завдання:");
        ThirdPrintResult(f1);
        ThirdPrintResult(f2);

    }

    public static int maxSalary(Firm a) {
        Set<Employee> o = new TreeSet<>();
        o.add(a.head);

        for (Iterator i = a.getDepartments().iterator(); i.hasNext(); ) {

            Department dx = (Department) i.next();
            o.add(dx.head);

            for (Iterator iter = dx.getEmployees().iterator(); iter.hasNext(); ) {
                Employee Ex = (Employee) iter.next();
                o.add(Ex);
            }

        }
        //  System.out.println(o);
        System.out.println();
        // Collections.sort(o); до Ростика питання
        int max = 0;
        for (Iterator i = o.iterator(); i.hasNext(); ) {
            Employee Ex = (Employee) i.next();
            if (Ex.getSalary() > max) {
                max = Ex.getSalary();
            }
        }
        return max;
    }

    public static void OnePrintResult(Firm a) {
        System.out.println("Максимальна зарплпта у фірмі " + a.getName() + " це: " + maxSalary(a));
    }

    public static Set<Department> twoQuest(Firm a) {
        Set<Department> result = new TreeSet<>(new CompareDepartment());
        for (Iterator<Department> i = a.getDepartments().iterator(); i.hasNext(); ) {
            Department dx = (Department) i.next();
            int headSalary = dx.head.salary;

            boolean l = false;

            for (Iterator<Employee> iter = dx.getEmployees().iterator(); iter.hasNext(); ) {
                Employee Ex = iter.next();
                if (Ex.salary > headSalary) {
                    l = true;
                }
            }

            if (l) {
                Department xx = new Department(dx.name, dx.head, dx.employees);
                result.add(xx);
            }

        }
        return result;
    }


    public static void TwoPrintResult(Firm a) {
        Set<Department> r = twoQuest(a);
        if (r.size() == 0) {
            System.out.println("У фірмі " + a.getName() + " немає ні одного працівника, котрий має зарплату більшу ніж начальник");
        } else {
            System.out.println("У фірмі " + a.getName() + " у наступних департаментах є працівники, у котрих зрплата більша ніж у начальника:");
            for (Iterator<Department> i = r.iterator(); i.hasNext(); ) {
                System.out.println(i.next());
            }

        }

    }

    public static void ThirdPrintResult(Firm a) {
        System.out.println("У фірмі " + a.getName() + " Працюють:");
        for (Object i : listPeople(a)) {
            System.out.println(i);
        }
    }

    public static Set<Employee> listPeople(Firm a) {
        Set<Employee> o = new TreeSet<>();
        o.add(a.head);
        for (Department i : a.departments) {
            o.add(i.head);
            for (Employee j : i.employees) {
                o.add(j);
            }
        }
        return o;
    }


}
