import java.util.HashSet;
import java.util.Objects;

class Department{
    String name;
    Worker headOfDepartment;
    HashSet<Worker> workers;

    public Department(String name, Worker headOfDepartment, HashSet<Worker> workers) throws SmallNumberOfWorkers {
        if (workers.size()>5){
            throw new SmallNumberOfWorkers();
        }
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
