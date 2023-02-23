import java.util.*;

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

        HashSet<Worker> workersOfMarketing = new HashSet();
        HashSet<Worker> sellers = new HashSet();
        HashSet<Worker> workersOfPlant = new HashSet();

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

        HashSet<Department> departments = new HashSet<>();

        departments.add(plant);
        departments.add(departmentOfMarketing);
        departments.add(departmentOfSelling);

        Company tesla = new Company("Tesla", departments, elonMusk);

        System.out.println(tesla.generalList());
        System.out.println(tesla.highestSalary());
        System.out.println(tesla.salaryIsHigherThanSalaryOfBoss());
        System.out.println(tesla.listSurnameWithSalary());

    }
}
class Worker{
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return name.equals(worker.name) && surname.equals(worker.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}



class Department{
    String name;
    Worker headOfDepartment;
    HashSet<Worker> workers;

    public Department(String name, Worker headOfDepartment, HashSet<Worker> workers) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return name.equals(that.name) && headOfDepartment.equals(that.headOfDepartment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, headOfDepartment);
    }
}



class Company{
    String name;
    HashSet<Department> departments;
    Worker manager;

    HashSet<Worker> director = new HashSet<>();

    public Company(String name, HashSet<Department> departments, Worker manager) {
        this.name = name;
        this.departments = departments;
        this.manager = manager;
        director.add(manager);
        Department directors = new Department("Cabinet of Director", manager, director);
        departments.add(directors);
    }
    // Список всіх працівників(for-each)
    HashSet<Worker> generalList(){
        HashSet<Worker> allWorkers = new HashSet();
        for(Object o: departments){
            if(o instanceof Department){
                allWorkers.addAll(((Department) o).workers);
            }
        }
        return allWorkers;
    }

    HashMap<String, Integer> listSurnameWithSalary() {
        HashMap<String, Integer> allWorkers = new HashMap<>();
        for (Iterator<Worker> listWorker = generalList().iterator(); listWorker.hasNext(); ) {
            Worker worker = listWorker.next();
            allWorkers.put(worker.surname, worker.salary);
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
