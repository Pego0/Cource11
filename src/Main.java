public class Main {
    public static void minSalary(Employee[] employees) {
        String name = "";
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (minSalary > employee.getSalary()) {
                minSalary = employee.getSalary();
                name = employee.getName();
            }
        }
        System.out.println("Employee with minimal salary is: " + name + ". His/her salary is: " + minSalary);
    }
    public static void maxSalary(Employee[] employees) {
        String name = "";
        int maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
                name = employee.getName();
            }
        }
        System.out.println("Employee with maximum salary is: " + name + ". His/her salary is: " + maxSalary);
    }
    public static void main(String[] args) {
        Employee[] workers = new Employee[]{
                new Employee("John H.", 1, 1000),
                new Employee("Mark L.", 2, 1080),
                new Employee("Max K.", 3, 980),
                new Employee("Marry I.", 4, 1000),
                new Employee("John F.", 5, 1100),
                new Employee("Mag G.", 1, 1050),
                new Employee("Leon W.", 2, 960),
                new Employee("Frost M.", 3, 970),
                new Employee("Brock N.", 4, 900),
                new Employee("Nita B.", 5, 990),
        };
        printService printService = new printService();
        printService.print(workers);
        minSalary(workers);
        maxSalary(workers);

    }
}

