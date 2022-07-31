public class printService {
    public void print(Employee[] employees) {
        System.out.println("Size of workers list: " + employees.length);
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            System.out.println("Name: " + employee.getName() + "; department: " + employee.getDepartment() + "; salary: " + employee.getSalary() + ".");
        }
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            sum = sum + employee.getSalary();
        }
        System.out.println("Sum of all salaries is: " + sum);
        int av = sum / employees.length;
        System.out.println("Average Salary is: " + av);
    }
}
