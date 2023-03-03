import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

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
        Department directors = null;
        try {
            directors = new Department("Cabinet of Director", manager, director);
        } catch (SmallNumberOfWorkers e) {
            throw new RuntimeException(e);
        }
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
            Department department = i.next();
            for(Iterator<Worker> k = department.workers.iterator(); k.hasNext();){
                Worker inspector = k.next();
                Worker manager = department.headOfDepartment;
                if(inspector.salary>manager.salary){
                    nameOfDepartments += department.name;
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
