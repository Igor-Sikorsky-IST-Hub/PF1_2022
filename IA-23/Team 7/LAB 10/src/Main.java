import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Worker elonMusk = new Worker("Elon", "Musk", 1);
        Worker johnStenly = new Worker("John", "Stenly", 15000);
        Worker ivanLeleka = new Worker("ivan", "Leleka", 11000);
        Worker siLon = new Worker("Si", "Lon", 12000);
        Worker abdulaMarin = new Worker("Abdula", "Marin", 9000);
        Worker fridrichWurst = new Worker("Fridrich", "Wurst", 125000);
        Worker pedroRiviero = new Worker("Pedro", "Riviero", 12345);
        Worker antuanLambre = new Worker("Antuan", "Lambre", 2500);
        Worker nassimTaleb = new Worker("Nassim", "Taleb", 1);
        Worker franciskoAmerotti = new Worker("Francisko", "Amerotti", 23000);
        Worker saimonCosta = new Worker("Saimon", "Costa", 5000);
        Worker jannetToulon = new Worker("Jannet", "Toulon", 10000);
        Worker abrachamTuire = new Worker("Abracham","Tuire",6000);
        Worker retroPetrenko = new Worker("Petro", "Petrenko", 6000);
        Worker igorSikorsky = new Worker("Igor","Sikorsky", 20000);
        Worker benuaBelo = new Worker("Benua", "Belo", 5500);
        Worker richardChan = new Worker("Richard", "Chan", 5000);
        ArrayList<Worker> workersOfMarketing = new ArrayList<Worker>();
        ArrayList<Worker> sellers = new ArrayList<Worker>();
        ArrayList<Worker> workersOfPlant = new ArrayList<Worker>();
        workersOfMarketing.add(johnStenly);
        workersOfMarketing.add(siLon);
        workersOfMarketing.add(abdulaMarin);
        workersOfMarketing.add(fridrichWurst);
        workersOfMarketing.add(pedroRiviero);
        workersOfMarketing.add(antuanLambre);
        sellers.add(franciskoAmerotti);
        sellers.add(saimonCosta);
        sellers.add(jannetToulon);
        workersOfPlant.add(abrachamTuire);
        workersOfPlant.add(retroPetrenko);
        workersOfPlant.add(benuaBelo);
        workersOfPlant.add(richardChan);
        Department plant = new Department("Plant", igorSikorsky, workersOfPlant);
        Department departmentOfSelling = new Department("DepartmentOfSelling", nassimTaleb, sellers);
        Department departmentOfMarketing = new Department("Marketing", ivanLeleka, workersOfMarketing);
        ArrayList<Department> departments = new ArrayList<Department>();
        departments.add(plant);
        departments.add(departmentOfMarketing);
        departments.add(departmentOfSelling);
        Company tesla = new Company("Tesla", departments, elonMusk);
        System.out.println(tesla.generalList());
        System.out.println(tesla.highestSalary());
        System.out.println(tesla.salaryIsHigherThanSalaryOfBoss());

    }
}
class Worker implements Comparable<Worker>{
    String name;
    String surname;
    int salary;

    public Worker(String name, String surname, int salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker{" + "name='" + name + '\'' + ", surname='" + surname + '\'' + ", salary=" + salary + '}';
    }

    @Override
    public int compareTo(Worker o) {
        if(this.name.compareTo(o.name)!=0){
            return this.name.compareTo(o.name);
        }
        return this.surname.compareTo(o.surname);
    }
}

class Department{
    String name;
    Worker headOfDepartment;
    ArrayList<Worker> workers;

    public Department(String name, Worker headOfDepartment, ArrayList<Worker> workers) {
        this.name = name;
        this.headOfDepartment = headOfDepartment;
        this.workers = workers;
        if(workers.contains(headOfDepartment)){
        }
        else {
            workers.add(headOfDepartment);
        }
    }

    @Override
    public String toString() {
        return "Department{" + "name='" + name + '\'' + ", headOfDepartment=" + headOfDepartment +'}';
    }
}

class Company{
    String name;
    ArrayList<Department> departments;
    Worker manager;

    ArrayList<Worker> director = new ArrayList<>();

    public Company(String name, ArrayList<Department> departments, Worker manager) {
        this.name = name;
        this.departments = departments;
        this.manager = manager;
        director.add(manager);
        Department directors = new Department("Cabinet of Director", manager, director);
        departments.add(directors);
    }
// Список всіх працівників(for-each)
    TreeSet<Worker> generalList(){
        TreeSet<Worker> allWorkers = new TreeSet<Worker>();
        for(Object o: departments){
            if(o instanceof Department){
                allWorkers.addAll(((Department) o).workers);
            }
        }
        return allWorkers;
    }
// Назва відділу, у якому зарплата працівника більша за зарплату начальника(типізований ітератор)
    String salaryIsHigherThanSalaryOfBoss(){
        String nameOfDepartments = "";
        for(Iterator<Department> i = departments.iterator(); i.hasNext();){
            Department abc = i.next();
            for(Iterator<Worker> k = abc.workers.iterator(); k.hasNext();){
                Worker inspector = k.next();
                Worker manager = abc.headOfDepartment;
                if(inspector.salary>manager.salary){
                    nameOfDepartments += abc.name;
                    nameOfDepartments += "  ";
                    break;
                }
            }
        }
        return nameOfDepartments;
    }
// Найбільша зарплата(нетипізований ітератор)
    Worker highestSalary() {
        Worker abc = null;
        int smallerSalary = 0;
        for (Iterator i = generalList().iterator(); i.hasNext(); ) {
            Object o = i.next();
            if (o instanceof Worker) {
                Worker inspector = (Worker) o;
                if (inspector.salary > smallerSalary) {
                    smallerSalary = inspector.salary;
                    abc = inspector;
                }
            }

        }
        return abc;
    }
}
