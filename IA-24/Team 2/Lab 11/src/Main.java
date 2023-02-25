import java.util.*;

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
        for(Department department : company.getDepartments()){
            for(Employer employer : department.getEmployers()){
                if(employer.getSalary()>department.getManager().getSalary()){
                    return department;
                }
            }
        }
        return null;
    }

    private static Set<Employer> EmployersList(Company company){
        Set<Employer> EmployersList = new TreeSet<>();
        EmployersList.add(company.getHead());
        for(Iterator<Department> iterator = company.getDepartments().iterator(); iterator.hasNext();){
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
        System.out.println(strangeDepartment(company).toString());
    }
    private static void zavd3(Company company){
        for (Employer i: EmployersList(company)) {
            System.out.print(i.toString()+", ");
        }
    }

    public static void main(String[] args) {
        Company xbox = new Company("xbox",new Employer("ivan", "Zelynskii",10000));
        Department Games = new Department("Games", new Employer("Nazarii", "Nover", 5000));
        Employer Kyril = new Employer("Kyril","Humenyuk", 1000, Games);
        Employer Masha = new Employer("Masha","Tylna", 1000, Games);
        Employer Ioann = new Employer("Ioann", "Liubchenko", 1000, Games);

        Department Movies = new Department("Movies", new Employer("Oleksandr", "Zelenskyi", 9000));
        Movies.getEmployers().add(new Employer("Masha","Tylna", 10000));
        Movies.getEmployers().add(new Employer("Kyril","Humenyuk", 10000));
        Movies.getEmployers().add(new Employer("Ioann", "Liubchenko", 10000));
        Movies.getEmployers().add(new Employer("Oleksandr", "Zelenskyi", 200000));




        xbox.getDepartments().add(Movies);
        xbox.getDepartments().add(Games);


        zavd1(xbox);
        zavd2(xbox);
        zavd3(xbox);

    }
