import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    private static int MaxSalary(Company company){
        int maxSalary = 0;
        for(Iterator iterator = EmployersList(company).iterator(); iterator.hasNext();){
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

    private static List<Employer> EmployersList(Company company){
        List<Employer> EmployersList = new ArrayList<>();
        EmployersList.add(company.getHead());
        for(Iterator<Department> iterator = company.getDepartmets().iterator(); iterator.hasNext();){
            Department current = iterator.next();
            EmployersList.add(current.getManager());
            EmployersList.addAll(current.getEmployers());
        }
        return EmployersList;
    }

    private static void zavd1(Company company){
        System.out.println(MaxSalary(company));
    }
    private static void zavd2(Company company){
        System.out.println(strangeDepartment(company).getName());
    }
    private static void zavd3(Company company){
        for (Employer i: EmployersList(company)) {
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