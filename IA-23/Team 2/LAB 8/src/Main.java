public class Main {
    public static void main(String[] args) {
        Employee defEmployee = new Employee();
        System.out.println(defEmployee.toString());
        Head defHead = new Head();
        System.out.println(defHead.toString());

        Head head1 = new Head("Yevhenii Voroniuk", 18, "Tesla", "KPI", "Java Junior SE");
        System.out.println(head1.toString());
        System.out.println(head1.getCompany());

        Employee employee1 = new Employee("Vadim Voloshyn", 18, "BMW");
        System.out.println(employee1.toString());
        System.out.println(employee1.getAge());

        Employee employee2 = new Employee("Nazar Savonik", 18, "Toyota");
        System.out.println(employee2.toString());

        System.out.println(employee1.equals(employee2));

        head1.setName("Vadim Voloshyn");
        System.out.println(head1);

    }
}
