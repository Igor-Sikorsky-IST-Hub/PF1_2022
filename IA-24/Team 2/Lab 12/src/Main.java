import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    private static int MaxSalary(Company company){
        int maxSalary = 0;
        for(Iterator iterator = EmployersSet(company).iterator(); iterator.hasNext();){
            Object employer = iterator.next();
            if(employer instanceof Employer currentEmployer) {
                int current = currentEmployer.getSalary();
                if(current>maxSalary) {maxSalary=current;}
            }
        }
        return maxSalary;
    }

    private static Department strangeDepartment(Company company){
        for(Department department : company.getDepartmets()){
            for(Employer employer : department.getEmployers()){
                if(employer.getSalary()>department.getManager().getSalary()){
                    return department;
                }
            }
        }
        return null;
    }

    private static Set<Employer> EmployersSet(Company company){
        Set<Employer> EmployersSet = new HashSet<>();
        EmployersSet.add(company.getHead());
        for(Iterator<Department> iterator = company.getDepartmets().iterator(); iterator.hasNext();){
            Department current = iterator.next();
            EmployersSet.add(current.getManager());
            EmployersSet.addAll(current.getEmployers());
        }
        return EmployersSet;
    }

    private static void zavd1(Company company){
        System.out.println("Maximum salary is: "+ MaxSalary(company));
    }
    private static void zavd2(Company company){
        System.out.println("A department in which at least one of the employees receives a salary" +
                " higher than that of their boss: "+ strangeDepartment(company).getName());
    }
    private static void zavd3(Company company){
        System.out.print("Our employees are: ");
        for (Employer i: EmployersSet(company)) {
            System.out.print(i.getName()+", ");
        }
    }

    public static void main(String[] args) {
        Company Sony = new Company("Sony",new Employer("Mike", "Ermantaraut",10000));
        Department Games = new Department("Games", new Employer("Norman", "Osborn", 5000));
        Employer Bob = new Employer("Bob","Oderkick", 1000, Games);
        Employer Jesse = new Employer("Jesse","Pinkman", 2000, Games);
        Employer James = new Employer("James", "McGill", 500, Games);

        Department Movies = new Department("Movies", new Employer("Bob", "Sponge", 5000));
        Movies.getEmployers().add(new Employer("Mary","Oderkick", 1000));
        Movies.getEmployers().add(new Employer("Jane","Overflow", 12000));
        Movies.getEmployers().add(new Employer("Chuck", "McGill", 500));
        Sony.getDepartmets().add(Games);
        Sony.getDepartmets().add(Movies);

        zavd1(Sony);
        zavd2(Sony);
        zavd3(Sony);

    }


}