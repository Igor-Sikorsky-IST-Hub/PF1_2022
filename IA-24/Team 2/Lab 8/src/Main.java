public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Manager("Tylna Mariia", 17, "Bachelor", "Junior Java Developer", 15000*12, 3000*6);
        Employee employee2 = new Manager("Humeniuk Kyrylo", 18, "Bachelor", "Backend Java Developer ", 16000*12, 3000*6);
        Employee employee3 = new Manager("Lubchenko Ioann", 18, "Bachelor", "Java Engineer", 15500*12, 3000*6);
        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
        System.out.println(employee3.toString());


    }
}