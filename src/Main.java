public class Main {
    public static void print(Employee[] workers) {
        System.out.println("Size of workers list: " + workers.length);
        for (int i = 0; i < workers.length; i++) {
            Employee employee = workers[i];
            System.out.println("Name: " + employee.getName() + "; department: " + employee.getDepartment() + "; salary: " + employee.getSalary() + ".");
        }
    }
    public static int allSalaries(Employee[] workers) {
        int sum = 0;
        for (int i = 0; i < workers.length; i++) {
            Employee employee = workers[i];
            sum = sum + employee.getSalary();
        }
        System.out.println("Sum of all salaries is: " + sum);
        return sum;
    }
    public static int avSalary(Employee[] workers) {
        int sum = 0;
        for (int i = 0; i < workers.length; i++) {
            Employee employee = workers[i];
            sum = sum + employee.getSalary();
        }
        double av = sum / workers.length;
        System.out.println("Average Salary is: " + av);
        return sum;
    }
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
        Employee[] workers = new Employee[10];
        workers[0] = new Employee("John H.", 1, 1000);
        workers[1] = new Employee("Mark L.", 2, 1080);
        workers[2] = new Employee("Max K.", 3, 980);
        workers[3] = new Employee("Marry I.", 4, 1000);
        workers[4] = new Employee("John F.", 5, 1100);
        workers[5] = new Employee("Mag G.", 1, 1050);
        workers[6] = new Employee("Leon W.", 2, 960);
        workers[7] = new Employee("Frost M.", 3, 970);
        workers[8] = new Employee("Brock N.", 4, 900);
        workers[9] = new Employee("Nita B.", 5, 990);
        print(workers);
        allSalaries(workers);
        avSalary(workers);
        minSalary(workers);
        maxSalary(workers);
    };
}

